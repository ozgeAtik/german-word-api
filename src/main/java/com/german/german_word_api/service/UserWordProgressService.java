package com.german.german_word_api.service;

import com.german.german_word_api.model.Word;
import com.german.german_word_api.repository.UserWordProgressRepository;
import com.german.german_word_api.model.UserWordProgress;
import com.german.german_word_api.repository.WordRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserWordProgressService {

    private final UserWordProgressRepository progressRepository;
    private final WordRepository wordRepository;

    //Dependency Injection
    public UserWordProgressService(UserWordProgressRepository progressRepository, WordRepository wordRepository){
        this.progressRepository = progressRepository;
        this.wordRepository = wordRepository;
    }

    public List<Word> getLearnedWords(Long userId){
        List <UserWordProgress> learnedProgresses = progressRepository.findByUserIdAndIsLearned(userId, true);

        List<Word> learnedWords = new ArrayList<>();

        for(UserWordProgress progress : learnedProgresses){
            wordRepository.findById(progress.getWordId())
                    .ifPresent(word -> learnedWords.add(word));
        }

        return learnedWords;
    }

}
