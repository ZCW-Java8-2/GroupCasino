package com.github.zipcodewilmington.casino.games.Player;

import com.github.zipcodewilmington.casino.CasinoAccount;

public class GamblerPlayer extends Person{
    public GamblerPlayer(CasinoAccount account, int balance, String name) {
        super(account, balance, name);
    }
    public int makeBet(int betAmount ){
        return betAmount;
    }
}
