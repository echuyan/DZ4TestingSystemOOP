package ru.otus.java;

import ru.otus.java.enums.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunTest {


    private boolean checkAnswer (String answer) {
       return  (answer.equals("1") ||  answer.equals("2") || answer.equals("3") || answer.equals("4") || answer.equals("5"));
    }

    public int runTest () throws IOException {
        int score=0;
        String answer;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Привет! Давайте начнем тест."+"\n");
        System.out.println("Вам будут заданы 3 вопроса и для каждого нужно выбрать один правильный вариант ответа. " +
                "Для ответа нажмите на клавиатуре цифру, соответствующую верному ответу и нажмите Enter."+
                "Максимальный балл - 3.");

        for (Questions question : Questions.values())
        {
            System.out.println(question.question());
            System.out.println(question.print());
            answer = reader.readLine();
            while (!checkAnswer(answer)) {
                System.out.println("Вы ошиблись при вводе ответа. Попробуйте еще раз. Принимаются только цифры с номером ответа.");
                answer = reader.readLine();
            }

            if (answer.equals(question.check())) {score++;}
        }
        return score;
    }


}
