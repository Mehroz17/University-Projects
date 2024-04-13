from flask import Flask,request,jsonify,send_file,make_response
from flask_cors import CORS
from diffusers import StableDiffusionPipeline
import torch


app = Flask('StableDiffusion')
CORS(app)


@app.route("/generate_image",methods=['POST'])
def generate_image():
    data = request.get_json()
    if 'text' in data:
        text = data['text']
        image = image_generate(text)


        image.save("./generatedimages/image.png")

        return send_file("./generatedimages/image.png", mimetype='image/png')

    else:
        return jsonify({"error": "Invalid request"}), 400





def image_generate(prompt):
    model_id = "runwayml/stable-diffusion-v1-5"
    pipe = StableDiffusionPipeline.from_pretrained(model_id, torch_dtype=torch.float16)
    pipe = pipe.to("cuda")
    image = pipe(prompt).images[0]
    return image


if __name__ == "__main__":
    app.run(host = '192.168.86.1',port=4000,debug=True) # host is the IP of the laptop
