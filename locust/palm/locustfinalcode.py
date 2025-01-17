import hmac
import hashlib
import csv
import time
import random
import string
import os
from locust import HttpUser, TaskSet, task, between



def generate_nonce(length=16):
    return ''.join(random.choices(string.ascii_letters + string.digits, k=length))

def generate_timestamp():
    return int(time.time())


# Secret key and API key
secret_key = b"08cb6f77e560b476e0d2f9b5e06de8e1f37a5e0f99f72e38b5fff10cbf8ca918"  # Use bytes for HMAC
api_key = "aBlXHvpZeKqY3zDmmMef7addMyNcQXJ9dDyLeChe"

all_images = []
base_dir=r"D:\images\palm"


class PalmProcess(TaskSet):
    palm_id = None 
    def on_start(self):  
        for root, dirs, files in os.walk(base_dir):
            for file in files:
                if file.lower().endswith(('.png', '.jpg', '.jpeg', '.bmp', '.gif')):  # Add more image formats if needed
                    all_images.append(os.path.join(root, file))
        
    @task
    def register_palm(self):
        nonce = generate_nonce()
        timestamp = generate_timestamp()

        # Create the signature
        elements = [nonce, str(timestamp), secret_key.decode()]  # Decode secret_key to string for concatenation
        elements.sort()

        raw_sign = ''.join(elements).encode()  # Convert to bytes for HMAC

        # Generate HMAC SHA-256 signature
        hashed_signature = hmac.new(secret_key, raw_sign, hashlib.sha256).hexdigest()


        # Prepare headers and parameters
        headers = {
            "Content-Type": "application/octet-stream",  
            "x-api-key": api_key
        }
        queries = {
            "nonce": nonce,
            "timestamp": str(timestamp),
            "signature": hashed_signature
        }

       # Get a random image path from the specified directory
        image_path = random.choice(all_images) if all_images else None
        if image_path is None:
            print("Error: No images found in the specified directory.")
            return

        try:
            with open(image_path, "rb") as binary_file:
                binary_data = binary_file.read()
        except FileNotFoundError:
            print("Error: Image file not found.")
            return		

        res = self.client.post("/palm/ir/register", data=binary_data, params=queries, headers=headers)
        try:
            resdata = res.json()
        except ValueError:
            print("Warning: Non-JSON response or empty response received.")
            
        self.palm_id = resdata.get("data", {}).get("id", "")
        success_message = resdata.get("message", '')
        print(f"Response data: {resdata}")
    
        if res.status_code == 200 and "success" in success_message.lower():
            print("Palm registration successful. Registered IR palm ID:", self.palm_id)

class MyUser(HttpUser):
    host = "https://api.minervaiotdev.com/biocloud/v1"
    tasks = [PalmProcess]
    wait_time = between(1, 5)
