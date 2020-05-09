package com.son.quizlet.controller;

import com.son.quizlet.stream.SimpleSourceBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class SampleController {
    @GetMapping
    public String callMe() {
        return "Hello from quizlet";
    }

    @GetMapping("/sampleQuizlet")
    public Quizlet getQuizlet() {
        log.info("Hello from sampleQuizlet!");
        return new Quizlet("OldQuizlet");
    }

    @GetMapping("/sampleQuizletById/{id}")
    public Quizlet getQuizletById(@PathVariable String id) {
        return new Quizlet(id, "New Quizlet");
    }

    @GetMapping("/sampleQuizletOAuth2")
    public String sampleQuizletOAuth2() {
        return "sampleQuizletOAuth2";
    }

    @Autowired
    SimpleSourceBean simpleSourceBean;

    @GetMapping("/saveQuizlet")
    public void saveQuizlet() {
        simpleSourceBean.publishChange("SAVE", UUID.randomUUID().toString());
    }
}
