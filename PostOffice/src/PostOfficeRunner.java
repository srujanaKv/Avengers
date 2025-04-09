import com.sruj.encapsulation.external.PostOfficeResearch;
import com.sruj.encapsulation.internal.PostOfficeTracker;

public class PostOfficeRunner {
    public static void main(String[] args) {
        PostOfficeTracker tracker = new PostOfficeTracker();
        tracker.trackPostOffice();

        PostOfficeResearch research = new PostOfficeResearch();
        research.studyPostOffice();
    }
}

