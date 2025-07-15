package in.sruj.Ticket;

public class Ticket {
    String name;
    double cost;
    String color[];

public Ticket(String name,double cost){

    this.name=name;
    this.cost=cost;
}
public void displayTicket(){
    System.out.println("name:"+name+"cost"+cost);

}
}
