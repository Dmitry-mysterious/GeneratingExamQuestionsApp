package org.skypro.generating_questions.model;

import org.skypro.generating_questions.service.ExaminerService;

import java.util.Objects;

public class Question implements ExaminerService {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() { return this.question; }
    public void setQuestion(String question) { this.question = question; }
    public String getAnswer() { return this.answer; }
    public void setAnswer(String answer) { this.answer = answer; }

//    @Override
//    public Collection<Question> getQuestions(int amount) {
//        if (amount <= 0 || amount > question.length()) {}
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question o1 = (Question) o;
        return Objects.equals(question, o1.question) && Objects.equals(answer, o1.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer);
    }

    @Override
    public String toString() {
        return question + " --> " + answer;
    }
}
