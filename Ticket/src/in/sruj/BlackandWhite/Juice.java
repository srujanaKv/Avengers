package in.sruj.BlackandWhite;
import java.util.Objects;
    public class Juice {

        public Juice(BlackAndWhite blackAndWhite){
            System.out.println("Black and White is a juice");
            if(Objects.nonNull(blackAndWhite)) {
                blackAndWhite.brand();
            }
            else
            {
                System.out.println("Null values Occur");
            }
        }
        public void brand(){
            System.out.println("Running in brand ");
        }
    }

}
