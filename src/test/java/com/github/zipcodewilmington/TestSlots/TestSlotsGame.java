package com.github.zipcodewilmington.TestSlots;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.zipcodewilmington.casino.games.slots.SlotsGame;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.Arrays;

public class TestSlotsGame {


    @Test
    public void testSlotMachine(){
        //Given
        int[] expect = {};
        SlotsGame sg = new SlotsGame();

        //When
        sg.slotMachine();

        //Then
        Assert.assertTrue(sg.getArr()[0] >= 0 && sg.getArr()[0] <= 7);
        Assert.assertTrue(sg.getArr()[1] >= 0 && sg.getArr()[1] <= 7);
        Assert.assertTrue(sg.getArr()[2] >= 0 && sg.getArr()[2] <= 7);
    }




    @Test
    public void testPullLever  (){
        //Given
        int[] expect = {};
        SlotsGame cg = new SlotsGame();

        //When
        cg.pullLever();

        //Then
//          Assert.assertArrayEquals

    }

}
