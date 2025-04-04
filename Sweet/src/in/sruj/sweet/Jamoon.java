package in.sruj.sweet;
import java.util.Objects;
public class Jamoon {
    public Jamoon (Sweet sweet){
        System.out.println("running constructor in jamoon");
        if(Objects.nonNull(Sweet)){
        Sweet.peda();
    }
        else{
            System.out.println("null value occurs");
        }
}
public void jalebi(){
    System.out.println("running laddu");
    }
}