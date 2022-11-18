package com.github.zipcodewilmington.casino.games.CoinToss;

import com.github.zipcodewilmington.casino.GamblerInterface;
import com.github.zipcodewilmington.casino.Player;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

public class CoinTossPlayer extends Player implements PlayerInterface, GamblerInterface {

    private final IOConsole console = new IOConsole(AnsiColor.BLUE);
    //public CoinTossPlayer() {}

    @Override
    public CasinoAccount getCasinoAccount() {
        return null;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }

    @Override
    public int placeBet() {

        //System.out.println("You are in CoinTossPlayer class, placeBet method.");

        int bet = console.getIntegerInput("Enter a number to bet: ");

        System.out.println("Your bet is: " + bet);

        return bet;
    }

    @Override
    public int increaseBet() {

        return 0;
    }
}
