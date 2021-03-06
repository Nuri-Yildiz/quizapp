package com.homework.quizapp.controller.rest.requestDTO;

import com.homework.quizapp.entity.Question;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionDTO {
    private String text;
    private Long id;
    private String imageUrl;
    private List<AnswerDTO> answers;


}
