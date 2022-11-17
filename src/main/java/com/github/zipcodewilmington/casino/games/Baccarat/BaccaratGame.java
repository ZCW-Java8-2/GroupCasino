package com.github.zipcodewilmington.casino.games.Baccarat;
import com.github.zipcodewilmington.casino.gameobjects.DeckOfCards;
import com.github.zipcodewilmington.casino.gameobjects.SingleCard;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;
public class BaccaratGame {

    private final IOConsole console = new IOConsole(AnsiColor.CYAN);

    public BaccaratGame() {

        DeckOfCards playerDeck = new DeckOfCards();
        DeckOfCards dealerDeck = new DeckOfCards();

        int playerScore = 0;
        int dealerScore = 0;

        SingleCard playerCard;
        SingleCard dealerCard;

        int turnCount = 0;
        while( turnCount != 53) { // Stop game after all cards are played

            //playerCard = playerDeck.playCard();
            //dealerCard = dealerDeck.playCard();

            //compareCards(playerCard, dealerCard);

            //if(somethingIsTrue) playerScore++;
            //if(somethingIsFalse) dealerScore++;

            turnCount++;
        }

        String gameResult = compareScores(playerScore, dealerScore);
        System.out.println(gameResult);
    }

    void playCard() { }

    public boolean compareCards (SingleCard playerCard, SingleCard dealerCard) {
//
//        int num = playerCard.getFace().compareTo(dealerCard.getFace());
//
//        if(num > 0) return true;
//        if(num < 0) return false;
        return false;
    }

    public String compareScores(int playerScore, int dealerScore) {
      if (playerScore > dealerScore) return "Player Wins!";
      if (playerScore < dealerScore) return "Player Loses!";
      else return "Tie game!";
    }






//    private void ShuffleCards() {
////        for (int i = 0; i < bDeck.length; i++) {
////            int j = (int) (Math.random() * bDeck.length);
////            SingleCard[] shuffled = bDeck[i];
////            bDeck[i] = bDeck[j];
////            bDeck[j] = shuffled;
////        }
//    }
//
//    private void IsTie () {
//       // if (dealerValue == playerValue) {
//       //     return ;
//       // }
//
//    }
//
//    private boolean NextRound () {
//        return false;
//    }
//
//
//     private boolean IsHandEmpty () {
//        return false;
//     }
}
