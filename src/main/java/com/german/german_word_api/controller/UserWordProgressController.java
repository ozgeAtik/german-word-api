package com.german.german_word_api.controller;

import com.german.german_word_api.model.Word;
import com.german.german_word_api.service.UserWordProgressService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/progress")
public class UserWordProgressController {

    private final UserWordProgressService progressService;

    public UserWordProgressController(UserWordProgressService progressService){
        this.progressService = progressService;
    }

    @GetMapping("/learned/{userId}")
    public ResponseEntity<List<Word>> getLearnedWords(@PathVariable Long userId){
        List<Word> learnedWords = progressService.getLearnedWords(userId);

        return ResponseEntity.ok(learnedWords);
    }

}
