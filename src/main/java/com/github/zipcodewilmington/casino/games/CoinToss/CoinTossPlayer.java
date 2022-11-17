package com.github.zipcodewilmington.casino.games.CoinToss;

import com.github.zipcodewilmington.casino.GamblerInterface;
import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.Player;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;

public class CoinTossPlayer extends Player implements PlayerInterface, GamblerInterface {

    public CoinTossPlayer() {
    }

    @Override
    public CasinoAccount getCasinoAccount() {
        return null;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }

    @Override
    public void placeBet() {

    }

    @Override
    public void increaseBet() {

    }
}
