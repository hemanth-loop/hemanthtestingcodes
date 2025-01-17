from locust import HttpUser, task, between

import global_config
from face_img_config import FaceImageConfig


class FaceVISLiveness(FaceImageConfig):

    @task
    def check_liveness(self):
        if self.binary_data is None:
            return

        res = self.client.post("/face/vis/liveness", data=self.binary_data, params=global_config.get_queries(),
                               headers=global_config.headers)
        global_config.liveness_response(res, "Face VIS Liveness")


class MyUser(HttpUser):
    host = "https://api.minervaiot.com/biocloud/v1"
    tasks = [FaceVISLiveness]
    wait_time = between(1, 5)
