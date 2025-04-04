package in.sruj.gold;

public class GoldRunner {
    public static void main(String[] args){
        String name="Ring";
        Gold gold=new Gold();

        Jewellery jewellery=new Jewellery(name,gold);
        jewellery.size();


}


}
