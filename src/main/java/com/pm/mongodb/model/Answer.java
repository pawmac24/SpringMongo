package com.pm.mongodb.model;

/**
 * Created by pmackiewicz on 2016-02-11.
 */
public class Answer {
    private String questionNumber;
    private String answerNumber;
    private boolean correct;
    private int pointsNumber;

    public Answer(String questionNumber, String answerNumber, boolean correct, int pointsNumber) {
        this.questionNumber = questionNumber;
        this.answerNumber = answerNumber;
        this.correct = correct;
        this.pointsNumber = pointsNumber;
    }

    public String getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(String questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getAnswerNumber() {
        return answerNumber;
    }

    public void setAnswerNumber(String answerNumber) {
        this.answerNumber = answerNumber;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public int getPointsNumber() {
        return pointsNumber;
    }

    public void setPointsNumber(int pointsNumber) {
        this.pointsNumber = pointsNumber;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "questionNumber='" + questionNumber + '\'' +
                ", answerNumber='" + answerNumber + '\'' +
                ", correct=" + correct +
                ", pointsNumber=" + pointsNumber +
                '}';
    }
}
