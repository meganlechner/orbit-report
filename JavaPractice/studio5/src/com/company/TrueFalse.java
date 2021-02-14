package com.company;

import java.util.ArrayList;

public class TrueFalse extends Question {
    private boolean givenAnswerTrueFalse;
    private boolean correctAnswerTrueFalse;

    public TrueFalse(String question, ArrayList<String> possibleAnswers, boolean correctAnswerTrueFalse) {
        super(question, possibleAnswers);
        this.correctAnswerTrueFalse = correctAnswerTrueFalse;
    }
}
