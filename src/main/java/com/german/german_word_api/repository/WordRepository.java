package com.german.german_word_api.repository;

import com.german.german_word_api.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<Word, Long>{
    //---------------------
}
