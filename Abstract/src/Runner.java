import external.Dream;
import external.NextStop;
import external.Start;
import internal.AbstractMetro;
import internal.AbstractProject;
import internal.AbstractThought;

public class runner {
    public static void main(String[] args){
        //Declare an abstract class with no abstract methods and extend it by a subclass. Create copy of subclass
        AbstractMetro abstractMetro=new NextStop();
        abstractMetro.source();
        //Declare an abstract class with abstract method and extend it by a subclass. Create copy of subclass

        AbstractThought abstractBuilding=new Dream();
        abstractBuilding.Think();

        //3. Declare an abstract class with one abstract method and one concrete method and extend it by a subclass. Create copy of subclass
        AbstractProject abstractProject=new Start();
        abstractProject.topic();
        abstractProject.plan();
}

}

