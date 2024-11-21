package model;

public class Answer {
    private String comment;
    private double grade;

    public Answer(double grade, String comment) {
        this.grade = grade;
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getGrade() { return grade; }

}
