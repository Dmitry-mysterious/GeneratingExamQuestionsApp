package org.skypro.generating_questions.service;

import org.skypro.generating_questions.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService extends Question implements QuestionService {
    private Set<Question> questions;
    private final Random random = new Random();

    public JavaQuestionService(String question, String answer) {
        super(question, answer);
    }

    private void addQuestion(String question, String answer) {
        this.questions.add(new Question(question, answer));
    }

    @Override
    public Question getRandomQuestion() {
        if (questions.isEmpty()) {
            throw new IllegalStateException("Список вопросов пуст.");
        }
        List<Question> listQuestions = new ArrayList<>(questions);

        return listQuestions.get(random.nextInt(listQuestions.size()));
    }

    @Override
    public void addQuestion(Question question) {

    }

    @Override
    public void removeQuestion(Question question) {

    }

    @Override
    public Collection<Question> getAllQuestions() {
        return List.of();
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        return List.of();
    }
}
