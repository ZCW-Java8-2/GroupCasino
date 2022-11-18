package com.github.zipcodewilmington.casino.games.Player;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.PlayerInterface;

public class Person implements PlayerInterface {
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
        this.balance+=depositAmount;
    }
    public void login(CasinoAccount casinoAccount){
        //CasinoAccount.getUsername()
    }


    @Override
    public CasinoAccount getArcadeAccount() {
        return new CasinoAccount("","");
    }

    @Override
//    public <SomeReturnType> SomeReturnType play() {
//        return null;
//    }
    public void play(){

    }
}
