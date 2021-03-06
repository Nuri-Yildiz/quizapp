package com.homework.quizapp.controller;

import com.homework.quizapp.controller.rest.requestDTO.QuestionDTO;
import com.homework.quizapp.controller.rest.requestDTO.QuizDTO;
import com.homework.quizapp.controller.rest.requestDTO.UserRegister;
import com.homework.quizapp.entity.Question;
import com.homework.quizapp.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/question")
public class QuestionController {
    private final QuestionService questionService;

    @PostMapping("/addQuestion")
    public Question addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @DeleteMapping("/{questionId}")
    public List<QuestionDTO> deleteQuestion(@PathVariable Long questionId){
        List<QuestionDTO> response = questionService.deleteQuestion(questionId);
        return response;
    }

    @GetMapping("/{quizId}")
    public List<QuestionDTO> getQuestionList(@PathVariable Long quizId){
        return questionService.getAllQuestion2(quizId);

    }

    @PutMapping("/")
    public String updateQuestion(@RequestBody Question question){
        String response = questionService.updateQuestion(question);
        return response;
    }



}
