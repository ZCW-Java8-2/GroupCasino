package com.github.zipcodewilmington.casino;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccount` is registered for each user of the `Arcade`.
 * The `ArcadeAccount` is used to log into the system to select a `Game` to play.
 */
public class CasinoAccount {
    private String username;
    private String password;
    private int balance;

    public CasinoAccount(String username, String password) {
        this.username = username;
        this.password = password;
      //  this.balance = userBalance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setBalance(int userBalance){
        this.balance = userBalance;
    }
    public int getBalance(){
        return this.balance;
    }
}
