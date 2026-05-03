package com.german.german_word_api.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_word_progress")
@Data
public class UserWordProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "word_id")
    private Long wordId;

    @Column(name = "is_learned")
    private boolean isLearned;

}
