package ru.otus.java;

import ru.otus.java.enums.Phrases;

public class EvaluationResult {
    public void printResult (int score) {
        System.out.println(Phrases.CHECKRESULT.phrase()+ score);
        switch (score) {
            case 3:
                System.out.println(Phrases.MAXSCORE.phrase());
                break;
            case 2:
                System.out.println(Phrases.INTERMEDSCORE.phrase());
                break;
            case 1:
                System.out.println(Phrases.LOWSCORE.phrase());
                break;
            case 0:
                System.out.println(Phrases.ZEROSCORE.phrase());

        }
        System.out.println(Phrases.BUY.phrase());
    }
}
