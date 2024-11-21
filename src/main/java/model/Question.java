package model;

public class Question {

    private int questionNumber;
    private String text;
    private Answer answer;

    public Question(int number, String text) {
        this.questionNumber = number;
        this.text = text;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }


}
