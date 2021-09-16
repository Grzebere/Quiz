package pl.projects.quiz.frontend;

import lombok.Data;

@Data
public class GameOptions {
    private int numberOfQuestions = 5;
    private Difficulty difficulty = Difficulty.MEDIUM;
    private int categoryId;
}
