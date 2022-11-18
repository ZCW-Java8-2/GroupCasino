package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.GamblerInterface;
import com.github.zipcodewilmington.casino.Player;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

public class SlotsPlayer extends Player implements PlayerInterface, GamblerInterface {

    private final IOConsole console = new IOConsole(AnsiColor.BLUE);

    @Override
    public CasinoAccount getCasinoAccount() {
        return null;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }

    @Override
    public double placeBet() {
        double bet = console.getDoubleInput("Enter a number to bet: ");
        System.out.println("Your bet is: " + bet);
        return bet;
    }

    @Override
    public double increaseBet() {
        return 0;
    }
}