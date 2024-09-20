import java.util.*;
public class Constructor{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Human h = new Human( "Kulot", 12, 84.0);
        System.out.println();

        h.start(); //return void start();
        System.out.println(h.name);
        System.out.println(h.age);
        System.out.println(h.grade);
        System.out.println();

        h.tagalog(); //return void tagalog() and name

        System.out.println();
        Human h1 = new Human("Curly", 13, 94.0);

        h1.talk(h);//h object wants to talk with h1 object
        h.talk(h1);

        Call cl = new Call();//output will be class call()
        
        System.out.println();

        h.talks("poy");//requires a random name for String
        h1.talks("poy");//requires a random name for String
    }
}
class Human{
    void start(){
        System.out.println("INFO:");
    }
    Scanner s = new Scanner(System.in);
    String name;
    int age;
    double grade;
    Human(String name, int age, double grade){
        this.name = name;//String name; and (String name)
        this.age = age;
        this.grade = grade;
        System.out.println("Surname "+name+" age: "+age+" lowest grade: "+grade);
    }
    void tagalog(){
        System.out.println("Ako si "+this.name);
    }

    void talk(Human h){
        System.out.println(name + " meets " + h.name);
    }
    
    void talks(String fname){
        System.out.println(name + " is younger than " + fname);
    }
}

class Call{
    Call(){
        System.out.println();
        System.out.println("TAWAG!");
    }
}
