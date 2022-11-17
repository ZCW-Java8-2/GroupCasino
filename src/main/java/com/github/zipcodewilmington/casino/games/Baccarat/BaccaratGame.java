package com.github.zipcodewilmington.casino.games.Baccarat;
import com.github.zipcodewilmington.casino.gameobjects.DeckOfCards;
import com.github.zipcodewilmington.casino.gameobjects.SingleCard;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;
public class BaccaratGame {
    private final IOConsole console = new IOConsole(AnsiColor.CYAN);
    SingleCard[][] bDeck = new DeckOfCards().deck;


    int dealerValue;
    int playerValue;
    public BaccaratGame () { }




    private void ShuffleCards() {
//        for (int i = 0; i < bDeck.length; i++) {
//            int j = (int) (Math.random() * bDeck.length);
//            SingleCard[] shuffled = bDeck[i];
//            bDeck[i] = bDeck[j];
//            bDeck[j] = shuffled;
//        }
    }

    private void IsTie () {
       // if (dealerValue == playerValue) {
       //     return ;
       // }

    }

    private boolean NextRound () {
        return false;
    }

     private void AddPoints () {

     }

     private void LosePoints () {

     }

     private boolean IsHandEmpty () {
        return false;
     }
}
