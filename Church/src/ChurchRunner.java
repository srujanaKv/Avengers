import com.sruj.external.Devotion;
import com.sruj.internal.Church;
import com.sruj.internal.God;

public class ChurchRunner {
    public static void main(String [] args){
        God god=new God();
        god.praygod();
        System.out.println("God is ruuning");
        Devotion devotion=new Devotion();
        devotion.DevotionActivity();
        System.out.println("Devotion is ruuning");


    }
}
