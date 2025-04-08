import com.sruj.external.Decoration;
import com.sruj.internal.Beachwalk;

public class ShellRunner {
    public static void main(String[] args) {
        Beachwalk walk = new Beachwalk();
        walk.explore();
        System.out.println("Beach walk completed");

        Decoration decor = new Decoration();
        decor.decorate();
        System.out.println("Decoration done with shells");
}
}

