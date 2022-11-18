package com.github.zipcodewilmington.casino.casinoaccount;

public class CasinoAccount {
    private String accountName;
    private String password;
    private double balance;

    public CasinoAccount() {

    }

    public CasinoAccount(String accountName, String password, double balance) {
        this.accountName = accountName;
        this.password = password;
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

}
