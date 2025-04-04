package in.sruj.sweet;
import java.util.Objects;
public class Jamoon {

    public Jamoon (Sweet sweet){

        System.out.println("Constructor Shop");
        if(Objects.nonNull(sweet))
        {
            sweet.box();
        }
        else {
            System.out.println("Null values occur");
        }
    }
    public void box(){
        System.out.println("Running in box method ");
    }
}
