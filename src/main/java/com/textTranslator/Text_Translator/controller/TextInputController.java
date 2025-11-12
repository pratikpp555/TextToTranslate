package com.textTranslator.Text_Translator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextInputController {


    public ResponseEntity<String> getMapping(
            @RequestParam("text") String inputText
    ){
        /*
        logic to be implemented
         */
        return ResponseEntity.ok("");
    }
}
