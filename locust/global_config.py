import hashlib
import hmac
import string
import time
import random

secret_key = b"2aff8966dc5dcc39e1dcb13b85de799824d0c2f21a1535769762ead6d02139be"  # Use bytes for HMAC
api_key = "yWYCMzRT3X2U4VkrGIXu24Uj5enK2yj174T81tjm"

face_img_dir = r"D:\imagesfortest"
palm_img_dir = r"D:\imagesforpalm"

headers = {
    "Content-Type": "application/octet-stream",
    "x-api-key": api_key
}


def get_queries(template=False):
    time_stamp = generate_timestamp()
    nonce = generate_nonce()
    queries = {
        "nonce": nonce,
        "timestamp": str(time_stamp),
        "signature": generate_signature(time_stamp, nonce),
    }

    if template:
        queries["templateId"] = generate_random_alphanumeric(7)
    return queries


def generate_nonce(length=16):
    return ''.join(random.choices(string.ascii_letters + string.digits, k=length))


def generate_timestamp():
    return int(time.time())


def generate_signature(time_stamp, nonce):
    elements = [nonce, str(time_stamp), secret_key.decode()]
    elements.sort()
    raw_sign = ''.join(elements).encode()
    return hmac.new(secret_key, raw_sign, hashlib.sha256).hexdigest()


def generate_random_alphanumeric(length):
    characters = string.ascii_letters + string.digits
    return ''.join(random.choice(characters) for _ in range(length))


def register_response(res, api_name):
    try:
        # Handle response
        print("Response status code (post):", res.status_code)
        print("Response time (ms):", res.elapsed.total_seconds() * 1000)

        resdata = res.json()
        face_id = resdata.get("data", {}).get("id", "")
        message = resdata.get("message", "")
        if res.status_code == 200 and "success" in message.lower():
            print(f"{api_name} was successful. ID:", face_id)
        else:
            print(f"{api_name} failed. Message:", message)
    except ValueError:
        print("Failed to parse response as JSON. Response text:", res.text)


def delete_response(res, api_name):
    try:
        print("Response status code (post): %d", res.status_code)
        print("Response time (ms): %.2f", res.elapsed.total_seconds() * 1000)
        response = res.json()
        print(response)
        message = response.get("message", '')
        if res.status_code == 200 and "success" in message.lower():
            print(f"{api_name} was successful.")
        else:
            print(f"{api_name} failed. Message:", message)
    except ValueError:
        print("Failed to parse delete response as JSON. Response text:", res.text)


def liveness_response(res, api_name):
    try:
        print("Response status code (post): %d", res.status_code)
        print("Response time (ms): %.2f", res.elapsed.total_seconds() * 1000)
        resdata = res.json()
        score = resdata.get("data", {}).get("score")
        print(f"{api_name} successful. Score ID: %s", score)

        message = resdata.get("message", None)
        if res.status_code == 200 and "success" in message.lower():
            print(f"{api_name} verified successfully. Score is: %s", score)
        else:
            print(f"{api_name} verification failed. Message: %s", message)
    except ValueError:
        print("Failed to parse response as JSON. Response text: %s", res.text)
