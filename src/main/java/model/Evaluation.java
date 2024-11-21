package model;

import java.util.List;
import java.util.UUID;

public class Evaluation {

    private final String evaluationId;
    private String courseId;
    private List<Question> questions;

    public Evaluation(String courseId,
                      List<Question> questions) {

        UUID uuid = UUID.randomUUID();
        this.evaluationId = uuid.toString();
        this.courseId = courseId;
        this.questions = questions;
    }

    public String getEvaluationId() {
        return evaluationId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public double calculateOverallGrade() {
        double sum = 0.0;
        for (Question q : questions) {
            Answer a = q.getAnswer();
            sum += a.getGrade();
        }
        return sum / questions.size();
    }
}
