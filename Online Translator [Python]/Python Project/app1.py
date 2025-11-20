from flask import Flask, render_template, request, jsonify
from googletrans import Translator

app = Flask(__name__)
app.config['DEBUG'] = True

translator = Translator()

@app.route('/', methods=['GET'])
def index():
    return render_template('index1.html')

@app.route('/translate', methods=['POST'])
def translate():
    try:
        data = request.get_json()
        text = data.get('text')
        lang = data.get('language')
        if not text or not lang or text.isspace() or lang.isspace():
            return jsonify({'error': 'Invalid input'}), 400
        translation = translator.translate(text.strip(), dest=lang.lower()).text
        return jsonify({'translation': translation})
    except Exception as e:
        return jsonify({'error': str(e)}), 500

if __name__ == '__main__':
    app.run()
    
from waitress import serve
import app1
serve(app1.app, host='127.0.0.1', port=5000)