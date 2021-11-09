package ru.otus.java.enums;

public enum Phrases {
    GREETING {
        @Override
        public String phrase() {
            return "Привет! Давайте начнем тест.\nВам будут заданы 3 вопроса и для каждого нужно выбрать один правильный вариант ответа.\n";
         };

    },

    MAXSCORE {
        @Override
        public String phrase() {
            return "Вы молодец! Максимальный балл!";
        };

    },

    INTERMEDSCORE{
        @Override
        public String phrase() {
            return "Неплохо! Уверенный уровень знаний.";
        };

    },

            LOWSCORE{
        @Override
        public String phrase() {
            return "Вам еще есть куда стремиться. Подготовьтесь получше.";
        };

    },
    ZEROSCORE{
        @Override
        public String phrase() {
            return "Кажется, этот тест не для вас. Вам стоит съесть мягких французских булок и выпить чаю. Лучше отдохнуть и не засорять голову лишней информацией!";
          };

    },
    CHECKRESULT {
        @Override
        public String phrase() {
            return "Давайте проверим, как вы справились!"+"\n"+"Ваш балл - ";
        };

    },
    BUY {
        @Override
        public String phrase() {
            return "Спасибо за прохождение теста. Увидимся!";
        };

    },
    ANSWERERROR {
        @Override
        public String phrase() {
            return "Вы ошиблись при вводе ответа. Попробуйте еще раз. Принимаются только цифры с номером ответа.";
        };

    };

        public abstract String phrase();
}

