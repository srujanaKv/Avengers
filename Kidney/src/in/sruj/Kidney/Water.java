package in.sruj.Kidney;
import java.util.Objects;
public class Water {
    public Water(Kidney kidney){
        System.out.println("Constructor Water");
        if(Objects.nonNull(kidney)) {
            kidney.Stone();
        }
        else
        {
            System.out.println("Null values Occur");
        }
    }
    public void Stone(){
        System.out.println("Running in Stone");
}
}

