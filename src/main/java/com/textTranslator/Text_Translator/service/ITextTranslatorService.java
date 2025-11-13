package com.textTranslator.Text_Translator.service;

public interface ITextTranslatorService {
    String getTranslatedText(String text);
    String detectLanguageOfText(String text);
}
