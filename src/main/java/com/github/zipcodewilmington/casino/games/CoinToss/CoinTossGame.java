package com.github.zipcodewilmington.casino.games.CoinToss;
import com.github.zipcodewilmington.casino.gameobjects.RNG_ITEM;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

public class CoinTossGame {
    private final IOConsole console = new IOConsole(AnsiColor.BLUE);

    public CoinTossGame() {

        RNG_ITEM coin = new RNG_ITEM(2);

        int playerGuess = console.getIntegerInput("1. Heads" +
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
        if(playerGuess == flipResult) { return true; }
            return false;
    }

}
