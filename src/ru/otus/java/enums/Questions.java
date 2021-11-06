package ru.otus.java.enums;

public enum Questions {
    QUESTION1 {
        @Override
        public String question() {
            return "В каком году принята декларация независимости США?";
        }
        @Override
        public String print() {
            return " 1. 1770\n 2. 1776\n 3. 1821\n 4. 1994";
        }
        @Override
        public String check() {
            return "2";
        }

    },


    QUESTION2 {
        @Override
        public String question() {
            return "Единица измерения силы тока - это:";
        }
        @Override
        public String print() {
            return " 1. Ампер\n 2. Ватт\n 3. Вольт\n 4. Паскаль\n 5. Килобит";
        }
        @Override
        public String check() {
            return "1";
        }
    },


    QUESTION3 {
        @Override
        public String question() {
            return "Что такое агорафобия?";
        }
        @Override
        public String print() {
            return " 1. Боязнь высоты\n 2. Боязнь замкнутых пространств\n 3. Боязнь открытых пространств";
        }
        @Override
        public String check() {
            return "3";
        }
    };

    public abstract String question();
    public abstract String print();
    public abstract String check();
}


