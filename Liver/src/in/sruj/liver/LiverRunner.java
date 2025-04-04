package in.sruj.liver;
public class LiverRunner {
    public static void main(String [] args){
        Liver liver = new Liver();
        HumanBody humanBody = new HumanBody(liver);
        liver.Cancer();

}
}

