package com.textTranslator.Text_Translator.service;

import org.springframework.stereotype.Service;

@Service
public class TextTranslatorService implements ITextTranslatorService{
    @Override
    public String getTranslatedText(String text) {
        if(text.isEmpty() || text.isBlank()){
            return "Text is Empty or null please send valid value";
        }
        return null;
    }

    @Override
    public String detectLanguageOfText(String text) {
        return null;
    }
}
