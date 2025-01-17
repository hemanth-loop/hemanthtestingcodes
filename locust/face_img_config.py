import os
import random

from locust import TaskSet

import global_config


class FaceImageConfig(TaskSet):
    all_images = []
    binary_data = []

    def on_start(self):
        for root, dirs, files in os.walk(global_config.face_img_dir):
            for file in files:
                if file.lower().endswith(('.png', '.jpg', '.jpeg')):
                    self.all_images.append(os.path.join(root, file))

        image_path = random.choice(self.all_images) if self.all_images else None

        if image_path is None:
            print("Error: No images found in the specified directory.")
            self.binary_data = None

        try:
            with open(image_path, "rb") as binary_file:
                self.binary_data = binary_file.read()
        except Exception as e:
            print(f"Error: {str(e)}")
            self.binary_data = None
