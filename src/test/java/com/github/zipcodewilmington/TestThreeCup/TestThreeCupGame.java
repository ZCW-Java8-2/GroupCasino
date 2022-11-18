package com.github.zipcodewilmington.TestThreeCup;

import com.github.zipcodewilmington.casino.games.ThreeCup.ThreeCupGame;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestThreeCupGame {


        @Test
        public void testNumGenerator(){
          //Given
          int expect = 0;
          ThreeCupGame cg = new ThreeCupGame();

           //When
          int actual = cg.numGenerator();

           //Then
          System.out.println(cg.numGenerator());

        }

        @Test
        public void testCheckNumber(){
          //Given
          String expected = "";
          ThreeCupGame cg = new ThreeCupGame();
          
          //When
          String actual = cg.checkNumber();

          //Then

          System.out.println(cg.checkNumber());
        }

}
