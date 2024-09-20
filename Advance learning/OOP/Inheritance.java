 import java.util.*;
public class Inheritance{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Mother m = new Mother("mama",1);
        Son sn = new Son("man", 2, "Selpon");
        Daughter dr = new Daughter("girl", 3, "Arte", "CuttingBangs");
        m.introduceM();
        sn.introduceS();
        dr.introduceD();
        dr.copyvoid();
    }
    
}
class Mother{
    String name;
    int age;
    Mother(String name, int age){
        this.name = name;
        this.age = age;
    }
    void introduceM(){
        System.out.println("I am the "+name);
        System.out.println("I am "+age);
    }
}
class Son extends Mother{
    String addHobby;
    Son(String name, int age, String addHobby){
        super(name, age);//overriding
        this.addHobby = addHobby;
    }
    //overriding
    void introduceS(){
        super.introduceM();
        System.out.println("hobby is "+addHobby);
    }
}
class Daughter extends Son{
    String addStupid;
    Daughter(String name, int age, String addHobby, String addStupid){
        super(name, age, addHobby);//overriding
        this.addStupid = addStupid;
    }
    void introduceD(){
        System.out.println("I am the lovely "+name);
        System.out.println("currently "+ age);
        System.out.println();
    }
    //overriding
    void copyvoid(){
        super.introduceS();//copy the void of son
        System.out.println(addHobby);
    }
}