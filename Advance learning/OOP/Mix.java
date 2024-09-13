import java.util.*;
//Encapsulation with Abstract with Constructors with Polymorph/Inherit
public class Mix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Humans bfs = new BF("Boy", 19, "Real me", 1.50);
        Humans gfs = new GF("Girl", 20, "Rog", 1.25);
        
        bfs.introduce();
        gfs.introduce();
        bfs.conf(gfs);
        //gfs.conf(bfs);
        bfs.talk(gfs);
        bfs.broccaine();
    }
}
abstract class Humans{
    private String name;
    private int num;
    private String cp;
    private double grade;

    Humans(String name, int num, String cp, double grade){
        this.name = name;
        this.num = num;
        this.cp = cp;
        this.grade = grade;
    }
    public String getName(){
        return name;
    }
    public int getInt(){
        return num;
    }
    public String getCP(){
        return cp;
    }
    public double getGrades(){
        return grade;
    }
    

    /* 
    public void setName(String name){
        this.name = name;
    }
    public void setInt(int num){
        this.num = num;
    }
    public void setCP(String cp){
        this.cp = cp;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
    */

     
    void introduce(){
        System.out.println("I am Human "+name);
    }
    void conf(Humans admire){
        //System.out.println();
        System.out.println(getName()+": I've been admiring you silently " + admire.getName());
    }
    void talk(Humans talk){
        System.out.println(getName()+ ": hello "+ talk.getName());
    }
    abstract void broccaine();
}
class BF extends Humans{
    BF(String name, int num, String cp, double grade){
        super(name, num, cp, grade);
    }
    void broccaine(){
        System.out.println(getName()+": Time to detach");
    }
}
class GF extends BF{
    GF(String name, int num, String cp, double grade){
        super(name, num, cp, grade);
    }
}