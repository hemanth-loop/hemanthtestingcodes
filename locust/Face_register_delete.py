from locust import HttpUser, task, between
import global_config
from Face_register import FaceProcess
from face_img_config import FaceImageConfig

# Shared list to store IDs for DELETE operation
delete_ids = []


class DeleteFace(FaceImageConfig):
    # Generate or load IDs before starting the test
    def on_start(self):
        global delete_ids

        if not delete_ids:
            for _ in range(10):  # Create 10 items
                # Register a face and store its ID
                res = FaceProcess.register_face(self)
                if res.status_code == 201:
                    resdata = res.json()
                    face_id = resdata.get('id')  # Extract 'id' from the response
                    if face_id:
                        delete_ids.append(face_id)
                else:
                    print("Failed to register face:", res.status_code, res.text)

    @task
    def delete_face(self):
        global delete_ids

        if delete_ids:
            face_id = delete_ids.pop(0)  # Get the first ID to delete
            headers = {
                "x-api-key": global_config.api_key
            }

            # Perform the DELETE request
            with self.client.delete(f"/face/{face_id}", 
                                    params=global_config.get_queries(), 
                                    headers=headers, 
                                    name="DELETE /face/{id}",
                                    catch_response=True) as res:
                if res.status_code == 200 or res.status_code == 204:
                    res.success()
                else:
                    res.failure(f"Failed to delete face {face_id}. Status: {res.status_code}")
        else:
            print("No more IDs to delete!")


class MyUser(HttpUser):
    host = "https://api.minervaiot.com/biocloud/v1"
    tasks = [DeleteFace]
    wait_time = between(1, 5)
