package com.company;

import java.util.ArrayList;

public class Question {

    private String question;
    private ArrayList possibleAnswers;


    public Question (String question, ArrayList<String> possibleAnswers){
        this.question = question;
        this.possibleAnswers = possibleAnswers;
    }


    public String getQuestion(){ return question; }
    public void setQuestion(String question){ this.question = question; }
    public ArrayList<String> getPossibleAnswers() { return possibleAnswers; }
    public void setPossibleAnswers(ArrayList<String> possibleAnswers){ this.possibleAnswers = possibleAnswers; }

}
