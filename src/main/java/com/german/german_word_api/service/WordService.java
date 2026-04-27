package com.german.german_word_api.service;

import com.german.german_word_api.dto.WordDto;
import com.german.german_word_api.model.Word;
import com.german.german_word_api.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WordService {

    private final WordRepository wordRepository;

    public List<WordDto> getAllWords(){
        return wordRepository.findAll()
                .stream()
                .map(word -> new WordDto(word.getGermanWord(), word.getArticle(), word.getMeaning()))
                .collect(Collectors.toList());
    }

    public WordDto saveWord(WordDto dto){
        Word word = new Word();
        word.setGermanWord(dto.germanWord());
        word.setArticle(dto.article());
        word.setMeaning(dto.meaning());

        Word savedWord = wordRepository.save(word);

        return new WordDto(savedWord.getGermanWord(),savedWord.getArticle(), savedWord.getMeaning());
    }

}
