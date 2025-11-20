from flask import Flask, render_template, request
from googletrans import Translator, LANGUAGES

app = Flask(__name__)

@app.route('/', methods=['GET'])
def index():
    return render_template('index1.html')

@app.route('/post', methods=['POST'])
def post():
    text_to_translate = request.form['text']
    target_language = request.form['target_language']
    translator = Translator()
    translation = translator.translate(text_to_translate, dest=target_language)
    return f"Translated text: {translation.text}"

if __name__ == "__main__":
    app.run(debug=True)