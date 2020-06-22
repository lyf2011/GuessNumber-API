package com.twschool.practice.domain;

public class GameRepository {
    private GuessNumberGame game;

    public GuessNumberGame create() {
        game = new GuessNumberGame(new AnswerGenerator());
        return game;
    }

    public GuessNumberGame find() {
        return game;
    }
}
