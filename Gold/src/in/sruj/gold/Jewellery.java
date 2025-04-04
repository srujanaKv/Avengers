package in.sruj.gold;

public class Jewellery {
    String name;
    Gold gold;

    public Jewellery(String name,Gold gold){
        this.name=name;
        this.gold=gold;

    }

    public void size(){

        System.out.println("the size of bangle");
        System.out.println("name of bangle:"+this.name);
        if(gold!=null){
            gold.carrat();
        }else{
            System.out.println("not null");
     }


}


}
