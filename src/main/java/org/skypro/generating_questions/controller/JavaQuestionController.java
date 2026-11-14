package org.skypro.generating_questions.controller;

import org.skypro.generating_questions.model.Question;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/exam")
public class JavaQuestionController {

    @PostMapping("/java/add")
    public Question addQuestion(@RequestBody Question question) {}

    @DeleteMapping("/java/remove")
    public Question removeQuestion(Question question) {}

    @GetMapping("/java")
    public Set<Question> getQuestions() {}

}
