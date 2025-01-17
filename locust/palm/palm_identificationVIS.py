from locust import HttpUser, task, between

import global_config
from palm_img_config import PalmImageConfig


class PalmProcess(PalmImageConfig):

    def register_palm_requestVIS(self):
        if self.binary_data is None:
            return

        return self.client.post("/palm/vis/identification", data=self.binary_data, params=global_config.get_queries(True),
                                headers=global_config.headers)

    @task
    def register_palm(self):
        res = self.register_palm_requestVIS()
        global_config.liveness_response(res, "palm identificationVIS")


class MyUser(HttpUser):
    host = "https://api.minervaiot.com/biocloud/v1"
    tasks = [PalmProcess]
    wait_time = between(1, 5)
