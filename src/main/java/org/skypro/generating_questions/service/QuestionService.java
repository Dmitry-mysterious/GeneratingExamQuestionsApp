package org.skypro.generating_questions.service;

import org.skypro.generating_questions.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;

public interface QuestionService {
    void addQuestion(Question question);
    void removeQuestion(Question question);
    Question getRandomQuestion();
    Collection<Question> getAllQuestions();
}
