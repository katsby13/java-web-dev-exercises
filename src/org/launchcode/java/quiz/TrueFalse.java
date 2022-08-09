package org.launchcode.java.quiz;

public class TrueFalse extends Question {

    private String answer1;
    private String answer2;
    private String correctAnswer;
    private String userAnswer;

    public TrueFalse(String aQuestion, String correctAnswer) {
        super(aQuestion, correctAnswer);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String getAnswer1() {
        return answer1;
    }

    @Override
    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    @Override
    public String getAnswer2() {
        return answer2;
    }

    @Override
    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }
    @Override
    public String getUserAnswer() {
        return userAnswer;
    }

    @Override
    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        TrueFalse example = (TrueFalse) toBeCompared;
        return example.getCorrectAnswer() == getUserAnswer();
}
}
