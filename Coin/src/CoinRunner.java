import com.sruj.external.CoinPlay;
import com.sruj.internal.CoinGame;

public class CoinRunner {
    public static void main(String[] args) {
        CoinGame game = new CoinGame();
        game.play();
        System.out.println("Coin game over");
        CoinPlay pay = new CoinPlay();
        pay.use();
        System.out.println("Payment done withcoin");
}
}

