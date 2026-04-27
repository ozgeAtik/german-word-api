package com.german.german_word_api.service;

import com.german.german_word_api.model.Word;
import com.german.german_word_api.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WordService {

    private final WordRepository wordRepository;

    public List<Word> getAllWords(){
        return wordRepository.findAll();
    }

    public Word saveWord(Word word){
        //adding word logic here
        return wordRepository.save(word);
    }

}
