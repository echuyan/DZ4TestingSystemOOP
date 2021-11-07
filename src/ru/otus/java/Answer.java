package ru.otus.java;

import ru.otus.java.enums.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer {
    private BufferedReader reader;

    public Answer() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    private boolean checkAnswer (String answer) {
        return  (answer.equals("1") ||  answer.equals("2") || answer.equals("3") || answer.equals("4") || answer.equals("5"));
    }

    public int readAndCheckAnswer(Questions questions) throws IOException {

        String answer = reader.readLine();
        while (!checkAnswer(answer)) {
        System.out.println("Вы ошиблись при вводе ответа. Попробуйте еще раз. Принимаются только цифры с номером ответа.");
        answer = reader.readLine();
        }

        if (answer.equals(questions.check())) {return 1;}
        else {return 0;}


    }

}
