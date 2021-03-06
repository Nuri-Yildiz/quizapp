package com.homework.quizapp.controller.rest.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultDTO {

    private String userName;

    private String quizName;

    private int correctAnswerCount;

    private int questionCount;

}
