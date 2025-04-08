import com.sruj.external.Gift;
import com.sruj.internal.Fragnance;

public class PerfumeRunner {
    public static void main(String[] args) {
        Fragnance fragrance = new Fragnance();
        fragrance.wear();
        System.out.println("Fragrance applied");

        Gift gift = new Gift();
        gift.give();
        System.out.println("Perfume gifted");
}
}

