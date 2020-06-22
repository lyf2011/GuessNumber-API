package com.twschool.practice.domain;

import com.twschool.practice.service.GameService;
import org.junit.Assert;
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

    @Test
    public void should_return_user_info_when_register_with_name_liyaofeng(){
        String userName = "liyaofeng";
        GuessNumberGame guessNumberGame = Mockito.mock(GuessNumberGame.class);
        GameRepository gameRepository = Mockito.mock(GameRepository.class);
        Mockito.when(gameRepository.find()).thenReturn(guessNumberGame);
        GameService gameService = new GameService(gameRepository);
        UserInfo user = gameService.register(userName);

        String expectName = user.getUserName();
        int score = user.getScore();

        Assert.assertEquals(expectName, userName);
        Assert.assertEquals(score, 0);
    }
}
