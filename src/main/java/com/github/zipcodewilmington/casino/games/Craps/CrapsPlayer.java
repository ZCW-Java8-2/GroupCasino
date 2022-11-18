package com.github.zipcodewilmington.casino.games.Craps;

import com.github.zipcodewilmington.casino.GamblerInterface;
import com.github.zipcodewilmington.casino.Player;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;

public class CrapsPlayer extends Player implements PlayerInterface, GamblerInterface {
    public int placeBet() {
        return 0;
    }

    @Override
    public int increaseBet() {

        return 0;
    }

    @Override
    public CasinoAccount getCasinoAccount() {
        return null;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}
