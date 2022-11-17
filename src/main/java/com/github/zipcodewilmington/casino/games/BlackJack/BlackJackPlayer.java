package com.github.zipcodewilmington.casino.games.BlackJack;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.Player.GamblerPlayer;

public class BlackJackPlayer extends GamblerPlayer implements PlayerInterface {

    public BlackJackPlayer(CasinoAccount account, int balance, String name) {
        super(account, balance, name);
    }

    @Override
    public CasinoAccount getArcadeAccount() {
        return null;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}
