package ru.otus.java;

import ru.otus.java.enums.Questions;


public class Question {


    public  Question() {}

    public void askNextQuestion(Questions questions) {

        System.out.println(questions.question());
        System.out.println(questions.printVariants());

    }
}




