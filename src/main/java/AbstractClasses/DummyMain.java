package AbstractClasses;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.games.Player.GamblerPlayer;
import com.github.zipcodewilmington.casino.games.Roulette.RouletteGame;

public class DummyMain {
    public static void main(String[] args) {
        RouletteGame rouletteGame = new RouletteGame(new GamblerPlayer(new CasinoAccount(),100, "John"));
        rouletteGame.runGame();
    }
}
