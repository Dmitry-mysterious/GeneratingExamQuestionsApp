package org.skypro.generating_questions.service;

import org.skypro.generating_questions.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

public class ExaminerServiceImpl implements ExaminerService {

    @Override
    public Collection<Question> getQuestions(int amount) {
        return List.of();
    }
}
