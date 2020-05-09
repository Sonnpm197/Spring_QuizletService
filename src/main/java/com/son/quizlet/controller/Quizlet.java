package com.son.quizlet.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Quizlet {
    private String id;
    private String quizletName;

    public Quizlet(String quizletName) {
        this.quizletName = quizletName;
    }
}
