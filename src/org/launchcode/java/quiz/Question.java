package org.launchcode.java.quiz;

public abstract class Question {
    private String aQuestion;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctAnswer;

    private String userAnswer;

    public Question(String aQuestion, String answer1, String answer2, String answer3, String answer4, String correctAnswer) {
        this.aQuestion = aQuestion;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
    }

    public Question(String aQuestion, String correctAnswer) {
        this.aQuestion = aQuestion;
        this.correctAnswer = correctAnswer;
    }

    public String getaQuestion() {
        return aQuestion;
    }

    public void setaQuestion(String aQuestion) {
        this.aQuestion = aQuestion;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }
}
