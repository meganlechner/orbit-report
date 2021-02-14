package com.company;

import java.util.ArrayList;

public class Checkbox extends Question {
    private ArrayList givenAnswersCheckbox;
    private ArrayList correctAnswersCheckbox;

    public Checkbox(String question, ArrayList<String> possibleAnswers, ArrayList<String> correctAnswersCheckbox) {
        super(question, possibleAnswers);
        this.correctAnswersCheckbox = correctAnswersCheckbox;
    }

    public ArrayList<String> getCorrectAnswersCheckbox(){ return correctAnswersCheckbox; }
}
