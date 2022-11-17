package com.github.zipcodewilmington.casino.games.CoinToss;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.gameobjects.RNG_ITEM;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

public class CoinTossGame implements GameInterface {
    private final IOConsole console = new IOConsole(AnsiColor.BLUE);
    private RNG_ITEM coin = new RNG_ITEM(2);

    public void run() {

        int playerGuess = console.getIntegerInput("Welcome to Coin Toss!" +
                "\n1. Heads" +
                "\n2. Tails" +
                "\nEnter a number:");
        int flipResult = coin.runRNG();

        if (isHeadsOrTails(playerGuess, flipResult)) {
            System.out.println("Congrats! You won the coin toss!");
        }
        else {
            System.out.println("Game over! You lost the coin toss!");
        }
    }

    public boolean isHeadsOrTails(int playerGuess, int flipResult) {
        return playerGuess == flipResult;
    }

    @Override
    public void add(PlayerInterface player) {}

    @Override
    public void remove(PlayerInterface player) {}

}
