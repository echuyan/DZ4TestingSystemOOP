package ru.otus.java;

public class EvaluationResult {
    public void printResult (int score) {
        System.out.println("Давайте проверим, как вы справились!"+"\n"+"Ваш балл - "+ score);
        switch (score) {
            case 3:
                System.out.println("Вы молодец! Максимальный балл!");
                break;
            case 2:
                System.out.println("Неплохо! Уверенный уровень знаний.");
                break;
            case 1:
                System.out.println("Вам еще есть куда стремиться. Подготовьтесь получше.");
                break;
            case 0:
                System.out.println("Кажется, этот тест не для вас. Вам стоит съесть мягких французских булок и выпить чаю. Лучше отдохнуть и не засорять голову лишней информацией!");

        }

        System.out.println("Спасибо за прохождение теста. Увидимся!");

    }
}
