package ru.otus.java.enums;

public enum Questions {
    QUESTION1 {
        @Override
        public String question() {
            return "В каком году принята декларация независимости США?";
        }
      },


    QUESTION2 {
        @Override
        public String question() {
            return "Единица измерения силы тока - это:";
        }
         },


    QUESTION3 {
        @Override
        public String question() {
            return "Что такое агорафобия?";
        }
        };

    public abstract String question();
   
}


