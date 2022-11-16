package com.github.zipcodewilmington.casino.games.Player;

import com.github.zipcodewilmington.casino.CasinoAccount;

public class Person {
    private CasinoAccount account;
    private int balance;
    private String name;

    public Person(CasinoAccount account, int balance, String name){
        this.account = account;
        this.balance = balance;
        this.name = name;
    }

    public CasinoAccount getAccount() {
        return account;
    }

    public void setAccount(CasinoAccount account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void deposit(int depositAmount){

    }


}
