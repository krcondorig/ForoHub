package com.alura.forohub.domain.topic.validation;
import com.alura.forohub.domain.topic.TopicDataUpdate;
import com.alura.forohub.domain.topic.UpdateTopic;
import com.alura.forohub.domain.user.User;

public interface UpdateValidation {
    void validate(TopicDataUpdate data, User user);

    void validate(UpdateTopic data, User user);
}
