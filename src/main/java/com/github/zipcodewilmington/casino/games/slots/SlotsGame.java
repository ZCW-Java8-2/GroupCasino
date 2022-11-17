package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.games.GameTypes.RandomGame;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame extends RandomGame {
    //test comment


    public static void main(String[] args[]) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int input;
        int Chips = 0;
        int Slot1, Slot2, Slot3;

        System.out.println("Slot Machine");
        System.out.println("Chips" + Chips);
        System.out.println("Press 1 to play, press 0 to quit the game");

        input = scanner.nextInt();

        do {
            Slot1 = random.nextInt(5) + 1;
            Slot2 = random.nextInt(5) + 1;
            Slot3 = random.nextInt(5) + 1;
            // slots range is 5 and starts at 1
            System.out.println(Slot1 + " " + Slot2 + " " + Slot3);

            if (Slot1 == Slot2 && Slot1 == Slot3) {
                Chips += 100;
                System.out.println("Congrats, you won 100 chips!");
            } else if (Slot1 == Slot2 || Slot1 == Slot3 || Slot2 == Slot3) {
                Chips += 50;
                System.out.println("You won 50 chips");
            } else {
                System.out.println("Sorry you lose");
                Chips -= 20;

            }
        } while (input == 1); // as long as input is 1 then game will continue
    }


























}
