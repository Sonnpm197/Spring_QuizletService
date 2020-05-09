package com.son.quizlet.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class SimpleSourceBean {
    private Source source;

    private static final Logger logger = LoggerFactory.getLogger(SimpleSourceBean.class);

    @Autowired
    public SimpleSourceBean(Source source) {
        this.source = source;
    }

    public void publishChange(String action, String quizletId) {
        logger.debug("Sending Kafka message {} for Quizlet Id: {}", action, quizletId);

        // The message to be published is a Java POJO
        QuizletChangeModel change = new QuizletChangeModel(
                QuizletChangeModel.class.getTypeName(),
                action,
                quizletId,
                "none");

        source.output()
                .send(MessageBuilder.withPayload(change).build());
    }
}
