package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;

public abstract class Player extends CasinoAccount implements PlayerInterface {

    String accountName;

    String password;

    Double balance;

    public Player(String accountName, String password, double balance) {

        this.accountName = accountName;
        this.password = password;
        this.balance = balance;//super(accountName, password, balance);
    }

    public Player() {
        super();
    }

    @Override
    public double getBalance() {

        return super.getBalance();
    }

//    public void setBalance(double balance) {
//
//        this.balance = balance;
//    }

    void playGame() {

    }
}
