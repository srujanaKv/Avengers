import com.sruj.external.BeachTour;
import com.sruj.internal.BeachActivity;

public class BeachRunner {
    public static void main(String []args){
        BeachActivity activity=new BeachActivity();
        activity.enjoy();
        System.out.println("beach activities completed");
        BeachTour tour=new BeachTour();
        tour.visit();
        System.out.println("beach tour completed");
    }
}
