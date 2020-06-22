package com.twschool.practice.domain;

import org.junit.Assert;
import org.junit.Test;

public class GameRepositoryTest {
    @Test
    public void should_return_game(){
        GameRepository gameRepository = new GameRepository();

        GuessNumberGame game = gameRepository.create();

        Assert.assertNotNull(game);
    }

    @Test
    public void should_find_game(){
        GameRepository gameRepository = new GameRepository();

        GuessNumberGame expectGuessGame = gameRepository.create();

        GuessNumberGame game = gameRepository.find();

        Assert.assertEquals(expectGuessGame, game);
    }
}
