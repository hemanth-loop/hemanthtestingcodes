from locust import HttpUser, task, between

import global_config
from face_img_config import FaceImageConfig


class FaceIdentification(FaceImageConfig):

    @task
    def face_identify(self):
        if self.binary_data is None:
            return

        res = self.client.post("/face/vis/identification", data=self.binary_data, params=global_config.get_queries(),
                               headers=global_config.headers)
        global_config.register_response(res, "Face Identification")


class MyUser(HttpUser):
    host = "https://api.minervaiot.com/biocloud/v1"
    tasks = [FaceIdentification]
    wait_time = between(1, 5)
