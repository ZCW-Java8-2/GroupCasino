package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.Scanner;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsPlayer implements PlayerInterface {

    // adding the user to the CasinoAccount, so we ensure which casinoUser we can update with
    private CasinoAccount casinoUser;
    Scanner scanner = new Scanner(System.in);

    //Create SlotsPlayer constructor;
    public SlotsPlayer(CasinoAccount ca){
        //System.out.println(ca.getBalance()+" "+ca.getUsername());
        this.casinoUser = ca;
    }

    //Create Getter and Setter for two properties
    public CasinoAccount getCasinoUser() {return this.casinoUser;}
    public void setCasinoUser(CasinoAccount casinoUser) {this.casinoUser = casinoUser;}
    public int getBalance() {return this.casinoUser.getBalance();}

    public void setBalance(int balance) {this.casinoUser.setBalance(balance);}

    public  CasinoAccount getArcadeAccount(){
        return casinoUser;
        //return new CasinoAccount(casinoUser.getUsername(), casinoUser.getPassword());
    }
    //add makeBet method for user
    public void makeBet(int amount){
        this.casinoUser.setBalance(this.casinoUser.getBalance()-amount);
    }


    public void play(){

    }
}