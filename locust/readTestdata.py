import csv
import random


class Csvread:

    def __init__(self,file):
        try:
            file = open(file)
        except FileNotFoundError:
            print("file not found")    

        self.file = file
        self.reader = csv.DictReader(file)

    def read(self):
        return random.choice(list(self.reader))        