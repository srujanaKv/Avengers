import com.java.internal.masala.internal85.Masala;
import com.java.internal.masala.internal85.GaramMasala;

public class KitchenShelf {

    public void useMasala(Masala masala) {
        if (masala != null) {
            masala.Spice();
            if (masala instanceof GaramMasala) {
                GaramMasala garam = (GaramMasala) masala;
                garam.Mix();
            }
        } else {
            System.out.println("No masala provided.");
        }
    }
