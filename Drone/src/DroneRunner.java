import com.sruj.external.DroneDelivery;
import com.sruj.internal.AerialPhoto;

public class DroneRunner {
        public static void main(String[] args) {
            AerialPhoto photo = new AerialPhoto();
            photo.capture();
            System.out.println("Aerial photography done");

            DroneDelivery delivery = new DroneDelivery();
            delivery.send();
            System.out.println("Drone delivery completed");
        }
    }

