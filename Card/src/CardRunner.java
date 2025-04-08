import com.sruj.external.Magic;
import com.sruj.internal.Joker;

public class CardRunner {
    public static void main(String[] args) {
        Joker joker = new Joker();
        joker.play();
        System.out.println("Poker game over");

        Magic magic = new Magic();
        magic.trick();
        System.out.println("Magic trickdone");
}
}

