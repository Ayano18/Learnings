import java.util.*;
public class Exercise{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println();
        Student sti = new Student("Timothy","Alvarez",1,"BSIT",1,95,96);
        System.out.println();
        sti.introduce();
        sti.grade();
    }

}
class Student{
    String fname;
    String lname;
    int yr;
    String course;
    int section;
    int midg;
    int finalg;
    Student(String fname, String lname, int yr, String course, int section, int midg, int finalg){
        this.fname = fname;
        this.lname = lname;
        this.yr = yr;
        this.course = course;
        this.section = section;
        this.midg = midg;
        this.finalg = finalg;
    }
    void introduce(){
        System.out.println("Greetings I am "+fname+" "+lname+", "+course+": "+yr+" section "+section);
    }
    void grade(){
        System.out.println("My midterm grade was "+midg);
        System.out.println("My final grade was "+finalg);
    }
}
/*
 *     public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println();
        int divid, divis, qou;
        System.out.println("Enter dividend: ");
        divid = s.nextInt();
        System.out.println("Enter divisor: ");
        divis = s.nextInt();
        try{
            qou = divid/divis;
            System.out.println(divid+"/"+divis+"="+qou);
        }
        catch(ArithmeticException a){
            System.out.println("divisor cannot be 0.");
            System.out.println("try again");
        }
    }
 */