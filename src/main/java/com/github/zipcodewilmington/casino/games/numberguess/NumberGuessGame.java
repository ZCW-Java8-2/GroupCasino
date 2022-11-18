package com.github.zipcodewilmington.casino.games.numberguess;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by leon on 7/21/2020 NumberGuessGame.
 */
public class NumberGuessGame implements GameInterface {
    private int num;

    public NumberGuessGame() {
        this.num = (int)(Math.random()*10)+1;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum(){
        return this.num;
    }


    public int getRandomNumber(){

        int randomNumber = (int)(Math.random()*5)+1;
        return randomNumber;
    }
//    public Boolean numberCompare(){
//        String result="";
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a number from 1 to 10: ");
//        num = in.nextInt();
//
//        return num==getRandomNumber();
//
//      }
//
// NumberGuessGame numGuess =  new NumberGuessGame();
    public int userNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 5: ");
        int usernumber = in.nextInt();
        return usernumber;
    }


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
            Scanner select12 = new Scanner(System.in);

            while(!exit){
                System.out.println("Play number guess game? Type 1 to play || 2 to exit.");
                int select = select12.nextInt();
                if(select==1){
                    int computerNumber = getRandomNumber();
                    int userNumber = userNumber();
                    if(computerNumber==userNumber){
                        System.out.print("\nYou won!  "+
                                "\nThe computer number is " +  computerNumber+
                                "\nand your guessing number is  "+userNumber+"\n");
                    }else {
                        System.out.println("You lost! " +
                                "\nThe computer number is " +  computerNumber+
                                "\nbut your guessing number is "+userNumber+"\n");
                    }
                }else break;
            }
    }

}