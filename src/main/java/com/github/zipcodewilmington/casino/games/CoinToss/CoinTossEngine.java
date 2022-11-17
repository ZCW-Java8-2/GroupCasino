package com.github.zipcodewilmington.casino.games.CoinToss;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

public class CoinTossEngine implements GameInterface {


    @Override
    public void add(PlayerInterface player) {}

    @Override
    public void remove(PlayerInterface player) {}

    @Override
    public void isGameOver() {}

    @Override
    public void evaluateTurn() {}

    @Override
    public void playAgain() {}

    @Override
    public void exitCasino() {}

    @Override
    public void run() {
        CoinTossGame coinToss = new CoinTossGame();

        int playerGuess = coinToss.getPlayerGuess();

        int flipResult = coinToss.flipCoin();

        String resultMessage = coinToss.resultMessage(playerGuess, flipResult);

        System.out.println(resultMessage);

    }

    @Override
    public void gameName() {}

    @Override
    public void gameRules() {}
}
