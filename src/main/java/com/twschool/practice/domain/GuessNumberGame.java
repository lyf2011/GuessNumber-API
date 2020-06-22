package com.twschool.practice.domain;

public class GuessNumberGame {
    public static final int MAX_TRY_TIMES = 6;
    public static final String CORRECT_RESULT = "4A0B";
    private final GameAnswer gameAnswer;
    private GameStatus gameStatus = GameStatus.CONTINUED;
    private int leftTryTimes = MAX_TRY_TIMES;

    private int gameScores = 0;
    public static final int SCORE_ONE_TIME = 3;

    public GuessNumberGame(AnswerGenerator answerGenerator) {
        this.gameAnswer = answerGenerator.generateAnswer();
    }

    public String guess(String userAnswerString) {
        String result = gameAnswer.check(userAnswerString);
        decreaseTryTimes();
        modifyStatus(result);
        changeScores();
        return result;
    }

    private void changeScores() {
        if (GameStatus.SUCCEED == gameStatus) {
            gameScores += SCORE_ONE_TIME;
        }
        if (GameStatus.FAILED == gameStatus) {
            gameScores -= SCORE_ONE_TIME;
        }
    }

    private void modifyStatus(String result) {
        if (CORRECT_RESULT.equals(result)) {
            gameStatus = GameStatus.SUCCEED;
        } else if (leftTryTimes == 0) {
            gameStatus = GameStatus.FAILED;
        }
    }

    private void decreaseTryTimes() {
        leftTryTimes --;
    }

    public GameStatus getStatus() {
        return gameStatus;
    }

    public int getGameScores() {
        return gameScores;
    }
}
