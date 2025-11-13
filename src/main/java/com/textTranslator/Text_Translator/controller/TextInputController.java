package com.textTranslator.Text_Translator.controller;

import com.textTranslator.Text_Translator.service.ITextTranslatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextInputController {

    ITextTranslatorService iTextTranslatorService;

    @Autowired
    public TextInputController(ITextTranslatorService iTextTranslatorService) {
        this.iTextTranslatorService = iTextTranslatorService;
    }

    public ResponseEntity<String> getMapping(
            @RequestParam("text") String inputText
    ){
        return ResponseEntity.ok(iTextTranslatorService.getTranslatedText(inputText));
    }
}
