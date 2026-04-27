package com.german.german_word_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record WordDto(
        @NotBlank(message = "Word can not be null")
        String germanWord,

        @NotBlank(message = "Article can not null")
        @Pattern(regexp = "^(der|die|das)$", message = "Article can only be der, die or das")
        String article,

        @NotBlank(message = "Meaning can not be null")
        String meaning) {}
