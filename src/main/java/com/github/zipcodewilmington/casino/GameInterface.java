package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.casino.PlayerInterface;

/**
 * Created by leon on 7/21/2020.
 */
public interface GameInterface extends Runnable {

    void run();

    void gameName();

    void gameRules();

    void add(PlayerInterface player);

    void remove(PlayerInterface player);

    void isGameOver();

    void evaluateTurn();

    void playAgain();

    void exitCasino();

}
