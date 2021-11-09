package ru.otus.java;

import ru.otus.java.enums.Phrases;
import ru.otus.java.enums.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *Переписать в ООП-стиле задание по разработке программы для тестирования из занятия "Java синтаксис: массивы, условные операторы, циклы".
 *Продумать структуру классов и как они будут между собой взаимодействовать (какие будут методы в классах).
 *
 */

public class Main {


     public static void main(String[] args) throws IOException {

         Answer[] answersQ1 = {
                 new Answer(" 1. 1770"),
                 new Answer("2. 1776"),
                 new Answer("3. 1821"),
                 new Answer("4. 1994")};

         Answer[] answersQ2 = {
                 new Answer(" 1. Ампер"),
                 new Answer("2. Ватт"),
                 new Answer("3. Вольт"),
                 new Answer("4. Паскаль"),
                 new Answer("5. Килобит")
         };

         Answer[] answersQ3 = {
                 new Answer(" 1. Боязнь высоты"),
                 new Answer("2. Боязнь замкнутых пространств"),
                 new Answer("3. Боязнь открытых пространств")};

        Question [] questions = {
                new Question(Questions.QUESTION1.question(), answersQ1,"2"),
                new Question(Questions.QUESTION2.question(), answersQ2,"1"),
                new Question(Questions.QUESTION3.question(), answersQ3,"3")

         };

         EvaluationResult result=new EvaluationResult();
         result.printResult(test(questions));

    }

    public static int test (Question [] questions) throws IOException {

        int score=0;
        int i=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Phrases.GREETING.phrase());

        for (i=0;i<questions.length;i++) {
            questions[i].askQuestion();
            String userAnswer = reader.readLine();
            while (!checkAnswer(userAnswer)) {
                System.out.println(Phrases.ANSWERERROR.phrase());
                userAnswer = reader.readLine();
            }
           if  (questions[i].checkRightAnswer(userAnswer)) {score++;}
        }
        
        return score;
    }

    private static boolean checkAnswer (String answer) {
        return  (answer.equals("1") ||  answer.equals("2") || answer.equals("3") || answer.equals("4") || answer.equals("5"));
    }
}
