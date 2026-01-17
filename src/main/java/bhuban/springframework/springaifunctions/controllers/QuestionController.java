package bhuban.springframework.springaifunctions.controllers;


import bhuban.springframework.springaifunctions.model.Answer;
import bhuban.springframework.springaifunctions.model.Question;
import bhuban.springframework.springaifunctions.services.OpenAIService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jt, Spring Framework Guru.
 */
@RequiredArgsConstructor
@RestController
public class QuestionController {

    private final OpenAIService openAIService;

    @PostMapping("/weather")
    public Answer askQuestion(@RequestBody Question question) {
        return openAIService.getAnswer(question);
    }

}
