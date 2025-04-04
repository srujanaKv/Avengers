package in.sruj.Earbuds;

import java.util.Objects;

public class EarDamage {
    public EarDamage(Earbuds earbuds) {
        System.out.println("Earbuds cause Ear damage");
        if (Objects.nonNull(earbuds)) {
            earbuds.Case();
        } else {
            System.out.println("Null values Occur");
        }
    }

    public void Case() {
        System.out.println("Running in Damage ");
    }
}

