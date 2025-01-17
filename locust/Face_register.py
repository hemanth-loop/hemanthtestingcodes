from locust import HttpUser, task, between

import global_config
from face_img_config import FaceImageConfig


class FaceProcess(FaceImageConfig):

    def register_face(self):
        if self.binary_data is None:
            return

        return self.client.post("/face/vis/register", data=self.binary_data, params=global_config.get_queries(True),
                                headers=global_config.headers)

    @task
    def face_registration(self):
        res = self.register_face()
        global_config.register_response(res, "Face Registration")


class MyUser(HttpUser):
    host = "https://api.minervaiot.com/biocloud/v1"
    tasks = [FaceProcess]
    wait_time = between(1, 5)
