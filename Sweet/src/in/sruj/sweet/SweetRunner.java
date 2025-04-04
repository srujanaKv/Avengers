package in.sruj.sweet;

public class SweetRunner {
    public static void main(String []args){
        Sweet sweet=new Sweet();
        Jamoon jamoon=new Jamoon(sweet);
        sweet.jalebi();
    }
}
