package com.german.german_word_api.controller;

import com.german.german_word_api.dto.WordDto;
import com.german.german_word_api.model.Word;
import com.german.german_word_api.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/words")
@RequiredArgsConstructor
public class WordController {

    private final WordService wordService;

    @GetMapping
    public List<WordDto> getAll(){
        return wordService.getAllWords();
    }

    @PostMapping
    public WordDto add(@Valid @RequestBody WordDto dto){
        return wordService.saveWord(dto);
    }

}
