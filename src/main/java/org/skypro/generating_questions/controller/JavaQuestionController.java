package org.skypro.generating_questions.controller;

import org.skypro.generating_questions.model.Question;
import org.skypro.generating_questions.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class JavaQuestionController {

    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/java/add")
    public void addQuestion(@RequestBody Question question) {
        questionService.addQuestion(question);
    }

    @DeleteMapping("/java/remove")
    public void removeQuestion(Question question) {
        questionService.removeQuestion(question);
    }

    @GetMapping("/java")
    public Collection<Question> getQuestions() {
        return questionService.getAllQuestions();
    }
}
