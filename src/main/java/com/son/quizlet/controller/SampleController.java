package com.son.quizlet.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
