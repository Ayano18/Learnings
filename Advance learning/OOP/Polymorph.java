import java.util.*;
public class Polymorph{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Phone cp1 = new Poco();
        Phone cp2 = new Xioami();
        Phone cp3 = new Tecno();
        cp1.intro();
        cp1.price(21000,"PHP ");
        cp2.intro();
        cp1.price(16000,"PHP ");
        cp3.intro();
        cp1.price(7500,"PHP ");

        System.out.println();
        
        cp1.overide();
        cp2.overide();
        cp3.overide();
    }
}
//I refuse to use contructor bcoz i want to print using return and parameters
class Phone{
    String DevName;
    String Chipset;
    void intro(){
        System.out.println("Device Name : "+DevName);
        System.out.println("Chipset : "+Chipset);
    }
    void price(int price, String letter){
        System.out.println(letter + price);
    }
    void overide(){
        System.out.println();
    }
}
class Poco extends Phone{
    Poco(){
        DevName = "F6";
        Chipset = "Snapdragon 8s Gen 3";
    }
    void overide(){
        System.out.println("ge");
    }
}
class Xioami extends Poco{
    Xioami(){
        DevName = "Redmi Turbo 3";
        Chipset = "Snapdragon 8s Gen 3";
    }
    void overide(){
        System.out.println("gege");
    }
}
class Tecno extends Xioami{
    Tecno(){
        DevName = "Pova 5 Pro";
        Chipset = "Dimensity 6080";
    }
    void overide(){
        System.out.println("gegege");
    }
}