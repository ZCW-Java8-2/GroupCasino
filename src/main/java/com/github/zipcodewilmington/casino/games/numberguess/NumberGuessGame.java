package com.github.zipcodewilmington.casino.games.numberguess;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by leon on 7/21/2020 NumberGuessGame.
 */
public class NumberGuessGame implements GameInterface {
    private int num;
    private int start=1;
    private int end=50;
    NumberGuessPlayer newPlayer;
    Scanner scanner =new Scanner(System.in);

    public NumberGuessGame() {}
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum(){
        return this.num;
    }

    public int getStart() {return start;}

    public void setStart(int start) {this.start = start;}

    public int getEnd() {return end;}

    public void setEnd(int end) {this.end = end;}

    public int getRandomNumber(){

         return (int)(Math.random()*50)+1;
    }

// NumberGuessGame numGuess =  new NumberGuessGame();
    public int userNumber(Scanner scanner){
        System.out.println("Enter an integer from "+this.start+" to "+this.end);
        return scanner.nextInt();
    }

    public Boolean numberCompare(int userNumber, int randonNumber){
        userNumber=userNumber(new Scanner(System.in));
        randonNumber = getRandomNumber();
        for(int i=0; i<3; i++){
            if(userNumber==getRandomNumber()){
                return true;

            }else if(userNumber>getRandomNumber()){
                this.start= start;
                this.end = userNumber;
                System.out.println("Too large. Enter a number from "+this.start+" to "+this.end);
                userNumber=scanner.nextInt();
            }else {
                this.start= userNumber;
                this.end = end;
                System.out.println("Too large. Enter a number from " + this.start + " to " + this.end);
                userNumber=scanner.nextInt();
            }
        }
        System.out.println("Your run out of tried.");
        return false;
      }
    public void add(PlayerInterface player) {}

    @Override
    public void remove(PlayerInterface player) {}
    @Override
    public Boolean checkWinner() {
        return null;
    }
    @Override
    public void run() {
        boolean exit = false;
        int amount;
        int input;
        while (!exit) {
            System.out.println("Your current balance is $" + newPlayer.getBalance()
                    + ". Enter amount for your bet: ");
            amount = scanner.nextInt();

            //make sure player's bet is less than his/her balance
            while (amount > newPlayer.getBalance()) {
                System.out.println("Your current balance is: " + newPlayer.getBalance() +
                        "\nRe-enter a value amount: ");
                amount = scanner.nextInt();
            }
            newPlayer.makeBet(amount);

            getRandomNumber();
            userNumber(new Scanner(System.in));
            numberCompare(getRandomNumber(),userNumber(new Scanner(System.in)));

            if (numberCompare(getRandomNumber(),userNumber(new Scanner(System.in)))) {
                newPlayer.setBalance(newPlayer.getBalance() + amount * 100);
                System.out.println("You won: $" + amount * 100 + ". ");
            } else {
                System.out.println("Three numbers are not matching. You lost!");
            }

            //Check if the player's balance is greater than 0;
            if (newPlayer.getBalance() <= 0) {
                System.out.println("Your current balance is $0. See you next time.\n");
                break;
            }
            System.out.println("Your remaining balance is $" + newPlayer.getBalance() +
                    "\nPlay again? 1 for YES || 2 for NO.");
            input = scanner.nextInt();
            if (input == 2) break;
        }
    }
}