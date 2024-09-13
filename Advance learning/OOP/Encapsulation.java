import java.util.*;
public class Encapsulation{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println();
        Object obj = new Object("Yasuo", 69, 'M');
        obj.setname("Yas");
        System.out.println(obj.getname());

        Object oobj = new Object("Zed", 96, 'M');
        
    }
}
class Object{
    //fname
    private String fname;
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }

    //age
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //sex
    private char sex;
    
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }

    //this Object Constructors is use for print only
    Object(String fname, int age, char sex){
        this.setFname(fname);
        this.setAge(age);
        this.setSex(sex);
    }
    /* 
    //this is example of constructors same us above
    Object(String fname, int age, char sex){
        this.fname = fname;
        this.age = age;
        this.sex = sex;
    }
     */


    //Setter
    void setname(String fname){
        System.out.println("this is setter: "+ fname);
    }
    //Getter
    String getname(){
        return "this is getter: " + fname;
    }
    
}