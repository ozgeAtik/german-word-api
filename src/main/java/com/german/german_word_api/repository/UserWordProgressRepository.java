package com.german.german_word_api.repository;

import com.german.german_word_api.model.UserWordProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserWordProgressRepository extends JpaRepository<UserWordProgress,Long> {

    List<UserWordProgress> findByUserIdAndIsLearned(Long userId,boolean isLearned);
}
