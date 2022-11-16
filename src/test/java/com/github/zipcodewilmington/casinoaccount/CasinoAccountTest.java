package com.github.zipcodewilmington.casinoaccount;

import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasinoAccountTest {

    @Test
    public void constructorTest(){
        CasinoAccount ca = new CasinoAccount("Dog", "DogPassword", 100.0);

        String classExpected = "class com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount";
        String classActual = ca.getClass().toString();

        String userNameExpected = "Dog";
        String userNameActual = ca.getAccountName();

        String passwordExpected = "DogPassword";
        String passwordActual = ca.getPassword();

        Double balanceExpected = 100.0;
        Double balanceActual = ca.getBalance();

        Assert.assertEquals(classExpected, classActual);
        Assert.assertEquals(userNameExpected, userNameActual);
        Assert.assertEquals(passwordExpected, passwordActual);
        Assert.assertEquals(balanceExpected, balanceActual, 0);
    }

    @Test
    public void increaseBalanceTest(){
        CasinoAccount ca = new CasinoAccount("Dog", "DogPassword", 100.0);

        double expected = 150.0;
        ca.increaseBalance(50.0);
        double actual = ca.getBalance();

        Assert.assertEquals(expected, actual, 0);
        System.out.println(ca.getBalance());
    }

}