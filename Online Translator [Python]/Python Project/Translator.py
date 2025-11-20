from flask import Flask, render_template, request
from googletrans import Translator,LANGUAGES

app=Flask(__name__)
@app.route('/',methods=['GET'])
def index():
    return render_template('index.html')
@app.route('/post',methods=['POST'])
def post():
    return "received:{}".format(request.form)

def Translate():
    try:
        translate=Translate()
        translation=translate(index.get(),dest=LANGUAGES)
    except Exception as e:
        print(f"Translation error:{e}")

if __name__=="__main__":
    app.run(debug=True)
from waitress import serve
import Translator
serve(Translator.app, host='127.0.0.1', port=5000)