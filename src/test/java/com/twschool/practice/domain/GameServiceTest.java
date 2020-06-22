package com.twschool.practice.domain;

import com.twschool.practice.service.GameService;
import org.junit.Test;
import org.mockito.Mockito;

public class GameServiceTest {
    @Test
    public void should_return_result_when_guess_number(){
        GuessNumberGame guessNumberGame = Mockito.mock(GuessNumberGame.class);
        GameRepository gameRepository = Mockito.mock(GameRepository.class);
        Mockito.when(gameRepository.find()).thenReturn(guessNumberGame);
        GameService gameService = new GameService(gameRepository);

        gameService.guess("1 2 3 4");

        Mockito.verify(gameRepository, Mockito.times(1)).find();
        Mockito.verify(guessNumberGame, Mockito.times(1)).guess("1 2 3 4");
    }
}
