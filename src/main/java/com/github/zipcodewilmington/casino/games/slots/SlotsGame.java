package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.GameTypes.RandomGame;

import java.util.Random;
import java.util.Scanner;


public class SlotsGame extends RandomGame implements GameInterface {
    private int[] arr = new int[3];
    Scanner scanner = new Scanner(System.in);
    //Create a SlotsPlayer objet and keep track of the player activities.
    SlotsPlayer newPlayer;

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
           arr[i] = generator.nextInt(4); //change to 4 for easier win chance

       }
        System.out.print("Your numbers are "+arr[0]+" "+arr[1]+" "+arr[2]+"\n");

   }
    public boolean pullLever() {

        return (arr[0]==arr[1]&&arr[1]==arr[2]);

    }
    //This method check if user have enough money to make bet;


    @Override
    public void add(PlayerInterface player) {
        newPlayer = new SlotsPlayer(player.getArcadeAccount());

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
        int amount;
        int input;
        while(!exit){
            System.out.println("Your current balance is $"+newPlayer.getBalance()
                    +". Enter amount for your bet: ");
            amount = scanner.nextInt();

            //make sure player's bet is less than his/her balance
            while(amount>newPlayer.getBalance()){
                System.out.println("Your current balance is: "+newPlayer.getBalance()+
                        "\nRe-enter a value amount: ");
                amount = scanner.nextInt();
            }
            newPlayer.makeBet(amount);

            slotMachine();
            pullLever();
            if(pullLever()){
                newPlayer.setBalance(newPlayer.getBalance()+amount*100 );
                System.out.println("You won: $"+ amount*3+". ");
            }else {
                System.out.println("Three numbers are not matching. You lost!");
            }

            //Check if the player's balance is greater than 0;
            if(newPlayer.getBalance()<=0){
                System.out.println("Your current balance is $0. See you next time.\n");
                break;
            }
             System.out.println("Your remaining balance is $"+ newPlayer.getBalance()+
                     "\nPlay again? 1 for YES || 2 for NO.");
             input= scanner.nextInt();
            if(input == 2) break;
        }

    }
}

