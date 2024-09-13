import java.util.*;

public class OOObject{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Car a = new Car();
        System.out.println();

        a.num = 0;
        System.out.println(a.num);//output 0;

        System.out.println(a.make);
        System.out.println(a.model);
        a.drive();
        a.park();
    }
}
class Car {
    int num = 1;
    String make = "lambo";
    String model = "black";
    void drive(){
        System.out.println("Driving");
    }
    void park(){
        System.out.println("Parking");
    }
}