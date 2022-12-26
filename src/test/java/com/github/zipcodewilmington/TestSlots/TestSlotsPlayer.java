package com.github.zipcodewilmington.TestSlots;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.games.slots.SlotsPlayer;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class TestSlotsPlayer {
@Test
//test getbbalance()
    public void testSlotsPlayerGetBalance(){
        SlotsPlayer newPlayer = new SlotsPlayer(new CasinoAccount("",""));
        newPlayer.setBalance(100);
        Assert.assertEquals(100,newPlayer.getBalance());
    }
    @Test
    //test makeBet()
    public void testSlotsPlayerMakeBet(){

        CasinoAccount casinoUser = new CasinoAccount("","");
        casinoUser.setBalance(100);
        SlotsPlayer newPlayer = new SlotsPlayer(casinoUser);

        newPlayer.makeBet(20);
        Assert.assertEquals(100, 20+casinoUser.getBalance() );
    }

    @Test
    //test remaining()
    public void testSlotsPlayerRemaining(){
        CasinoAccount casinoUser = new CasinoAccount("","");
        casinoUser.setBalance(100);
        SlotsPlayer newPlayer = new SlotsPlayer(casinoUser);
        newPlayer.makeBet(20);
        Assert.assertEquals(80, casinoUser.getBalance() );
    }
}
