package com.github.zipcodewilmington.casino.casinoaccount;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccount` is registered for each user of the `Arcade`.
 * The `ArcadeAccount` is used to log into the system to select a `Game` to play.
 */
public class CasinoAccount {

    private String accountName;
    private String password;
    private double balance;

    public CasinoAccount() {

    }

    public String getAccountName() {
        return accountName;
    }

    public String getPassword() {
        return password;
    }


    public CasinoAccount(String accountName, String password, double balance) {
        this.accountName = accountName;
        this.password = password;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void increaseBalance(double balance){
        this.balance = balance;
    }

}
