package ru.otus.java;

import ru.otus.java.enums.Questions;

import java.io.IOException;

/**
 * Система тестирования
 * Цель:
 * Цель упражнения - получить базовые знания в работе с массивами, циклами, условными операторами и т.д.
 *
 * Написать систему тестирования.
 *
 * На экран выводится вопрос и варианты ответа, с клавиатуры вводится номер ответа.
 * Вопросы и ответы должны быть зашиты в коде, внешнего хранения в файлах или базах данных не нужно.
 *
 * Должно быть три вопроса, каждый с 3-5 вариантами ответов.
 * Все вопросы с одним правильным вариантом ответа.
 *
 * После прохождения теста отображается результат.
 *
 * Использовать только циклы, массивы, условия и другие структуры, которые были пройдены на данный момент в рамках курса.
 * В этом задании не нужно использовать ООП.
 *
 */

public class Main {

     public static void main(String[] args) throws IOException {

         System.out.println("Привет! Давайте начнем тест."+"\n");
         System.out.println("Вам будут заданы 3 вопроса и для каждого нужно выбрать один правильный вариант ответа. " +
                 "Для ответа нажмите на клавиатуре цифру, соответствующую верному ответу и нажмите Enter."+
                 "Максимальный балл - 3.");


        int score=0;
        Question   question = new Question();
        Answer answer = new Answer();
        EvaluationResult result=new EvaluationResult();

         for (Questions questions : Questions.values()) {
             question.askNextQuestion(questions);
             score = score + answer.readAndCheckAnswer(questions);
         }

         result.printResult(score);
    }
}
