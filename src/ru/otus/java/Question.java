package ru.otus.java;


public class Question {

    private String question;
    private Answer[] answers;
    private String rightAnswer;


    public  Question(String question,Answer[] answers,String rightAnswer) {
        this.question=question;
        this.answers=answers;
        this.rightAnswer=rightAnswer;
    }


   public void askQuestion() {
       System.out.println(question);
       for (int i = 0; i < answers.length; i++) {
           answers[i].printAnswerVariants();
       }
   }

   public boolean checkRightAnswer (String userAnswer) {
        return userAnswer.equals(rightAnswer);
   }

}




