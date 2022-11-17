package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.games.GameTypes.RandomGame;

import java.util.Arrays;
import java.util.Random;


public class SlotsGame extends RandomGame {

   public int[] arr = new int[3];
//
//    public int[] getArr() {
//        return arr;
//    }
//
//    public void setArr(int[] arr) {
//        this.arr = arr;
//    }
public SlotsGame(){
    super();
}
   // SlotsGame slot = new SlotsGame();
    public int[] slotMachine() {
       Random generator = new Random();
       // int slot = (int) (Math.random() * 7) + 0;

//       int[] arr = new int[3];
       for (int i = 0; i < arr.length; i++) {
           arr[i] = generator.nextInt(7);
       }
       return arr;
   }
    public String pullLever() {
//        boolean playGame = true;
       // for (int i = 0; i < arr.length; i++) {
        int count =0;
        while(count<arr.length-1){
        if (arr[count]!=arr[count+1]){
                return "You lose!";
            }else{
            count++;
            }

        }
        return "You win!";
    }

}
