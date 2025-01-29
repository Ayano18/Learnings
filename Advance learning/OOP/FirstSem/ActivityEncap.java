
import java.util.*;
public class ActivityEncap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Studyante me = new Studyante();
        System.out.println("----------");
        Studyante both = new Studyante("name", 1);
        System.out.println("----------");
        Studyante nameonly = new Studyante("name");
        System.out.println("----------");
        Studyante ageonly = new Studyante(1);
    }
}
class Studyante{
    private String name;
    private int age;
    
    public Studyante(){
        name = "No name yet";
        age = 0;
        System.out.println(name);
        System.out.println(age);
    }

    public Studyante(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Name: " +name);
        System.out.println("Age: " + age);
    }
    
    public Studyante(String name){
        this.name = name;
        age = 0;
        System.out.println("Name: " +name);
    }

    public Studyante(int age){
        name = "no name";
        this.age = age;
        System.out.println("Age: " + age);
    }
    
}
