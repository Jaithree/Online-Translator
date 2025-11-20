# translation/views.py
from django.shortcuts import render
from django.http import JsonResponse
from googletrans import Translator

translator = Translator()

def index(request):
    return render(request, 'translation/index1.html')

def translate(request):
    if request.method == 'POST' and request.is_ajax():
        data = request.POST
        text = data.get('text')
        lang = data.get('language')
        
        if not text or not lang:
            return JsonResponse({'error': 'Invalid input'}, status=400)
            
        
        translation = translator.translate(text, dest=lang.lower()).text
        return JsonResponse({'translation': translation})
    
    return JsonResponse({'error': 'Invalid request method'}, status=405)
    
