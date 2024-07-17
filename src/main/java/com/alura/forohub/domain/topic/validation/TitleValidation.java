package com.alura.forohub.domain.topic.validation;

import com.alura.forohub.domain.topic.DataTopic;
import com.alura.forohub.domain.topic.TopicRepository;
import com.alura.forohub.domain.topic.UpdateTopic;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitleValidation implements ValidationTopical {

    @Autowired
    TopicRepository topicRepository;

    @Override
    public void validate(DataTopic dataTopic) {
        var title = topicRepository.existsByTitle(dataTopic.title());
        if (title) {
            throw new ValidationException("There is already a topic with that title.");
        }
    }

    @Override
    public void validate(UpdateTopic data) {
        var title = topicRepository.existsByTitle(data.title());
        if (title) {
            throw new ValidationException("There is already a topic with that title.");
        }
    }
}
