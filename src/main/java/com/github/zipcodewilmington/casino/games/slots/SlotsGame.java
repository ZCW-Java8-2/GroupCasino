package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.GameTypes.RandomGame;

import java.util.Random;
import java.util.Scanner;


public class SlotsGame extends RandomGame implements GameInterface {
    private int[] arr = new int[3];

public SlotsGame(){
    super();
}

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void slotMachine() {
       Random generator = new Random();

       for (int i = 0; i < arr.length; i++) {
           arr[i] = generator.nextInt(7);

       }
        System.out.print("Your numbers are "+arr[0]+" "+arr[1]+" "+arr[2]+"\n");

   }
    public void pullLever() {

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
        boolean exit = false;
        Scanner in = new Scanner(System.in);
        while(!exit){
            System.out.println("Pull lever? 1 for YES || 2 for NO");
            int input  = in.nextInt();
            if(input == 2) break;
            slotMachine();
            pullLever();
        }

    }
}

