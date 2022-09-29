package pl.sdacademy.projektplus.quiz.frontend;

import lombok.Data;

@Data
public class GameOptions {
    private int numberOfQuestions = 6;
    private Difficulty difficulty;
    private int categoryId;
}
