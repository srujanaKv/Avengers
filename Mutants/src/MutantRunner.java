import com.sruj.external.MutantResearch;
import com.sruj.internal.MutantTracker;

public class MutantRunner {
    public static void main(String[] args) {
        MutantTracker tracker = new MutantTracker();
        tracker.trackMutant();

        MutantResearch research = new MutantResearch();
        research.studyMutant();
}
}

