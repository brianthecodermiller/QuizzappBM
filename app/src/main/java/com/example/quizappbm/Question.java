package com.example.quizappbm;


public class Question {
    private String text;
    private boolean answer;

    public Question(String text, boolean answer) {
        this.text = text;
        this.answer = answer;
    }


    public String getText() {
        return text;
    }

    public boolean getcorrectAnswer() {
        return answer;
    }

    public void setText(String newText) {
      text = newText;

    }
    public void setcorrectAnswer ( boolean newAnswer) {
        answer = newAnswer;
    }

    }