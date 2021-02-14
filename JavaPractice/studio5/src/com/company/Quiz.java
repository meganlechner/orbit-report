package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {

    void runQuestion1() {
        ArrayList<String> possibleAnswers1 = new ArrayList<String>(Arrays.asList("bird", "marsupial", "reptile"));
        MultipleChoice question1 = new MultipleChoice("A kangaroo is a: ", possibleAnswers1, "marsupial");
        System.out.println(question1.getQuestion());
    }


}
