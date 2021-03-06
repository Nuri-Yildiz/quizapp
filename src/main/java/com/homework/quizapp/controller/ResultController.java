package com.homework.quizapp.controller;

import com.homework.quizapp.controller.rest.requestDTO.CreateResultDTO;
import com.homework.quizapp.controller.rest.requestDTO.ResultDTO;
import com.homework.quizapp.entity.Question;
import com.homework.quizapp.entity.Result;
import com.homework.quizapp.service.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/results")
public class ResultController {
    private final ResultService resultService;

    @PostMapping("")
    public void saveResult(@RequestBody CreateResultDTO resultDTO) {
        String response = resultService.saveResult(resultDTO);
    }
    @GetMapping("")
    public List<ResultDTO> getResults(){
        return resultService.getResults();
    }
}
