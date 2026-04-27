package com.german.german_word_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="words")
@Data
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String germanWord;

    @Column(nullable = false)
    private String article;

    private String meaning;

}
