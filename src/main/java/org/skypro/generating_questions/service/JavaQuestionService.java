package org.skypro.generating_questions.service;

import org.skypro.generating_questions.model.Question;

import java.util.Set;

public class JavaQuestionService implements QuestionService {
    private Set<Question> questions;

    public void questionAdd(String question, String answer) {
        Question q = new Question(question, answer);
        questions.add(q);
    }

    public void questionAdd(Question question) {
        questions.add(question);
    }

    public void questionRemove(Question question) {}
}
