package com.github.zipcodewilmington.casino;
//command
/**
 * Created by Yingjie Yang.
 */
public interface GameInterface extends Runnable {
    /**
     * adds a player to the game
     * @param player the player to be removed from the game
     */
    void add(PlayerInterface player);

    /**
     * removes a player from the game
     * @param player the player to be removed from the game
     */
    void remove(PlayerInterface player);

    Boolean checkWinner();
    /**
     * specifies how the game will run
     */
    void run();
}
