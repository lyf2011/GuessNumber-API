package com.twschool.practice.service;

import com.twschool.practice.domain.GameRepository;
import com.twschool.practice.domain.GuessNumberGame;

public class GameService {
    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {

        this.gameRepository = gameRepository;
    }

    public String guess(String number) {
        GuessNumberGame game = gameRepository.find();
        return game.guess(number);
    }
}
