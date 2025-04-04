package in.sruj.Kidney;

public class KidneyRunner {
    public static void main(String [] args){
        Kidney kidney = new Kidney();
        Water water = new Water(kidney);
        kidney.Stone();

}
}

