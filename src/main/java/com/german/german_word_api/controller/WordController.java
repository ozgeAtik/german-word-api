package com.german.german_word_api.controller;

import com.german.german_word_api.model.Word;
import com.german.german_word_api.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/words")
@RequiredArgsConstructor
public class WordController {

    private final WordService wordService;

    @GetMapping
    public List<Word> getAll(){
        return wordService.getAllWords();
    }

    @PostMapping
    public Word add(@RequestBody Word word){
        return wordService.saveWord(word);
    }

}
