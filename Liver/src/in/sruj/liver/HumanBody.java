package in.sruj.liver;
import java.util.Objects;

public class HumanBody {
    public HumanBody(Liver liver){
        System.out.println("liver cancer for liver only");
        if(Objects.nonNull(liver)) {
            liver.Cancer();
        }
        else
        {
            System.out.println("Null values Occur");
        }
    }
    public void Cancer(){
        System.out.println("Running in Cancer ");
    }
}


