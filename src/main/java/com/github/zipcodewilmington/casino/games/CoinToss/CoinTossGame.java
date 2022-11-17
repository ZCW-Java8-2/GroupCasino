package com.github.zipcodewilmington.casino.games.CoinToss;

import com.github.zipcodewilmington.casino.gameobjects.RNG_ITEM;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

public class CoinTossGame {
    private final IOConsole console = new IOConsole(AnsiColor.YELLOW);
    private final RNG_ITEM coin = new RNG_ITEM(2);

    public void welcomeToCoinToss(){
        console.println("\n" +
                " ,-----.       ,--.            ,--------.                     " + "\n" +
                "'  .--./ ,---. `--',--,--,     '--.  .--',---.  ,---.  ,---.  " + "\n" +
                "|  |    | .-. |,--.|      \\       |  |  | .-. |(  .-' (  .-'  " + "\n" +
                "'  '--'\\' '-' '|  ||  ||  |       |  |  ' '-' '.-'  `).-'  `) " + "\n" +
                " `-----' `---' `--'`--''--'       `--'   `---' `----' `----'  " + "\n");
    }
    public int getPlayerGuess() {
        return console.getIntegerInput("Welcome to Coin Toss!" +
                "\n1. Heads" +
                "\n2. Tails" +
                "\nEnter a number:");
    }

    public int flipCoin() {
        return coin.runRNG();
    }

    public boolean doesItMatch(int playerGuess, int flipResult) {
        return playerGuess == flipResult;
    }

    public String resultMessage(int playerGuess, int flipResult) {
        if (doesItMatch(playerGuess, flipResult)) {
            return "Congrats! You won the coin toss!";
        }
        else {
            return "Game over! You lost the coin toss!";
        }
    }


}
