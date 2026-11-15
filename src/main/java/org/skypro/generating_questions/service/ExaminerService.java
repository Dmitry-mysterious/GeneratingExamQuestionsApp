package org.skypro.generating_questions.service;

import org.skypro.generating_questions.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
