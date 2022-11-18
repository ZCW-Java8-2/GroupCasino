package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.GameTypes.RandomGame;

import java.util.Random;
import java.util.Scanner;


public class SlotsGame extends RandomGame implements GameInterface {

   public int[] arr = new int[3];

public SlotsGame(){
    super();
}
  
    public void slotMachine() {
       Random generator = new Random();

       for (int i = 0; i < arr.length; i++) {
           arr[i] = generator.nextInt(7);

       }
        System.out.print("Your numbers are "+arr[0]+" "+arr[1]+" "+arr[2]+"\n");

      // return arr;
   }
    public void pullLever() {
        int count =0;

        if (arr[0]==arr[1]&&arr[1]==arr[2]){

            System.out.println("You won!");

            }else{
            System.out.println("You lost!");
            }

    }

    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public Boolean checkWinner() {
        return null;
    }

    @Override
    public void run() {
        slotMachine();
        pullLever();
    }
}

