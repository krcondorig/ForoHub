package com.alura.forohub.domain.topic.validation;
import com.alura.forohub.domain.topic.DataTopic;
import com.alura.forohub.domain.topic.UpdateTopic;

public interface ValidationTopical {
    void validate(DataTopic data);

    void validate(UpdateTopic data);
}
