package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.casino.PlayerInterface;

/**
 * Created by leon on 7/21/2020.
 */
public interface GameInterface extends Runnable { //TODO Rename this to GameEngineInterface?

    void run();

    void gameName(); // TODO remove entirely?

    void gameRules(); // TODO do we need this?

    void add(PlayerInterface player);

    void remove(PlayerInterface player); // TODO do we need this?

    void isGameOver(); //TODO Move to separate GameInterface?

    boolean evaluateTurn(); //TODO Move to separate GameInterface?

    void playAgain(); //TODO Move to separate GameInterface?

    void exitCasino(); //TODO remove entirely?

}
