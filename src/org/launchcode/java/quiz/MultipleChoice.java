package org.launchcode.java.quiz;

public class MultipleChoice extends Question {

    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctAnswer;
    private String userAnswer;

    public MultipleChoice(String aQuestion, String answer1, String answer2, String answer3, String answer4, String correctAnswer) {
        super(aQuestion, answer1, answer2, answer3, answer4, correctAnswer);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
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
    public String getAnswer3() {
        return answer3;
    }

    @Override
    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    @Override
    public String getAnswer4() {
        return answer4;
    }

    @Override
    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
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
    public String getUserAnswer() {
        return userAnswer;
    }

    @Override
    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
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
        MultipleChoice example = (MultipleChoice) toBeCompared;
        return example.getCorrectAnswer() == getUserAnswer();
    }
}
