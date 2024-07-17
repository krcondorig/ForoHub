package com.alura.forohub.domain.topic;

import jakarta.validation.constraints.NotBlank;

public record DataTopic(
        @NotBlank
        String title,
        @NotBlank
        String message,
        @NotBlank
        String course
) {
}
