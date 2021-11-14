import json

json_file = open("test.json")

data = json.load(json_file)

print(data["columns"][0])

