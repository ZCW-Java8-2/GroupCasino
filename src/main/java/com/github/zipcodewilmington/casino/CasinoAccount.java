package com.github.zipcodewilmington.casino;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccount` is registered for each user of the `Arcade`.
 * The `ArcadeAccount` is used to log into the system to select a `Game` to play.
 */
public class CasinoAccount {

    private String userName;
    private String password;
    private double balance;

    public CasinoAccount(String userName, String password, double balance) {
        this.userName = userName;
        this.password = password;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void increaseBalance(double balance){
        this.balance += balance;
    }

}
