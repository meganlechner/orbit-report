package com.company;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    private String givenAnswerMultipleChoice;
    private String correctAnswerMultipleChoice;

    public MultipleChoice(String question, ArrayList<String> possibleAnswers, String correctAnswerMultipleChoice) {
        super(question, possibleAnswers);
        this.correctAnswerMultipleChoice = correctAnswerMultipleChoice;
    }

    public String getCorrectAnswerMultipleChoice() { return correctAnswerMultipleChoice; }
}
