import com.sruj.external.KeychainResearch;
import com.sruj.internal.KeychainTracker;

public class KeychainRunner {
    public static void main(String[] args) {
        KeychainTracker tracker = new KeychainTracker();
        tracker.trackKeychain();

        KeychainResearch research = new KeychainResearch();
        research.studyKeychain();
    }
}

