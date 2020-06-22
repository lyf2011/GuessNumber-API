package com.twschool.practice.service;

import com.twschool.practice.domain.GuessNumberGame;

public class GameService {
    private GuessNumberGame guessNumberGame;

    public GameService(GuessNumberGame guessNumberGame) {

        this.guessNumberGame = guessNumberGame;
    }

    public String guess(String number) {
        return guessNumberGame.guess(number);
    }
}
