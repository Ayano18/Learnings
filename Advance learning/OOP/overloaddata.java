import java.util.*;
public class overloaddata{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println();
        Gago g = new Gago("Zed", 69, "Male", "Earth");
        Gago g1 = new Gago("Zed", 69, "Male");
        Gago g2 = new Gago("Zed", 69);
        Gago g3 = new Gago("Zed");
        System.out.println();
    }
}

class Gago{
    String name;
    int age;
    String sex;
    String loc;
    Gago(String name, int age, String sex, String loc){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.loc = loc;
        System.out.println("My name is "+ name +" I am "+ age +" Sex: "+sex+" Location "+loc);
    }
    Gago(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        loc = "unknown";
        System.out.println("My name is "+ name +" I am "+ age +" Sex: "+sex+" Location "+loc);
    }
    Gago(String name, int age){
        this.name = name;
        this.age = age;
        sex = "unknown";
        loc = "unknown";
        System.out.println("My name is "+ name +" I am "+ age +" Sex: "+sex+" Location "+loc);
    }
    Gago(String name){
        this.name = name;
        age = 0;
        sex = "unknown";
        loc = "unknown";
        System.out.println("My name is "+ name +" I am "+ age +" Sex: "+sex+" Location "+loc);
    }
}