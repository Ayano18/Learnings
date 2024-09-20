import java.util.*;
public class practice{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Kuya ky = new Kuya("Killua", 12);
        Bunso bn = new Bunso("Alluka", 8, "cp");
        System.out.println();

        ky.introduce();
        System.out.println();
        bn.copy();
    }
}
class Kuya{
    String name;
    int age;
    Kuya(String name, int age){
        this.name = name;
        this.age = age;
    }
    void introduce(){
        System.out.println("I am "+name);
        System.out.println(age);
    }
}
class Bunso extends Kuya{
    String game;
    Bunso(String name, int age, String game){
        super(name, age);
        this.game = game;
    }
    void copy(){
        super.introduce();
        System.out.println("I have a "+game);
    }
}