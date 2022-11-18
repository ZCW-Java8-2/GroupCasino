package com.github.zipcodewilmington.casinoaccount;

import com.github.zipcodewilmington.casino.casinoaccount.AccountDatabase;
import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AccountDatabaseTest {

    @Test
    public void addCasinoAccountTest(){

        AccountDatabase database = new AccountDatabase();

        CasinoAccount calvinsAcc = new CasinoAccount("Calvin", "Tran", 0.00);
        CasinoAccount carolinasAcc = new CasinoAccount("Carolina", "Tran", 0.00);
        CasinoAccount taylorAcc = new CasinoAccount("Taylor", "Tran", 0.00);
        CasinoAccount emoryAcc = new CasinoAccount("Emory", "Tran", 0.00);

        database.addCasinoAccount(calvinsAcc);
        database.addCasinoAccount(carolinasAcc);
        database.addCasinoAccount(taylorAcc);
        database.addCasinoAccount(emoryAcc);

        int actual = database.getSize();
        int expected = 4;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void removeCasinoAccountTest(){

        AccountDatabase database = new AccountDatabase();

        CasinoAccount calvinsAcc = new CasinoAccount("Calvin", "Tran", 0.00);
        CasinoAccount carolinasAcc = new CasinoAccount("Carolina", "Tran", 0.00);
        CasinoAccount taylorAcc = new CasinoAccount("Taylor", "Tran", 0.00);
        CasinoAccount emoryAcc = new CasinoAccount("Emory", "Tran", 0.00);

        database.addCasinoAccount(calvinsAcc);
        database.addCasinoAccount(carolinasAcc);
        database.addCasinoAccount(taylorAcc);
        database.addCasinoAccount(emoryAcc);

        database.removeCasinoAccount(calvinsAcc);

        int actual = database.getSize();
        int expected = 3;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getCasinoAccountTest(){

        AccountDatabase database = new AccountDatabase();

        CasinoAccount calvinsAcc = new CasinoAccount("Calvin", "Tran", 0.00);
        CasinoAccount carolinasAcc = new CasinoAccount("Carolina", "Tran", 0.00);
        CasinoAccount taylorAcc = new CasinoAccount("Taylor", "Tran", 0.00);
        CasinoAccount emoryAcc = new CasinoAccount("Emory", "Tran", 0.00);

        database.addCasinoAccount(calvinsAcc);
        database.addCasinoAccount(carolinasAcc);
        database.addCasinoAccount(taylorAcc);
        database.addCasinoAccount(emoryAcc);

        CasinoAccount actual = database.getCasinoAccount("Calvin");
        CasinoAccount expected = calvinsAcc;

        Assert.assertEquals(actual, expected);
    }

}