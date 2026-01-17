package bhuban.springframework.springaifunctions.services;


import bhuban.springframework.springaifunctions.model.Answer;
import bhuban.springframework.springaifunctions.model.Question;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface OpenAIService {

    Answer getAnswer(Question question);
}
