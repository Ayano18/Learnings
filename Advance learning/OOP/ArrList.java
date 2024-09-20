import java.util.*;
public class ArrList{
    public static void main(String[] args){
        ArrayList<String> studentname = new ArrayList<>();

        studentname.add("With Highest Honor");
        studentname.add("With High Honor");
        studentname.add("With Honor");
        studentname.add(0, "Bopols");//automatically replace to first


        System.out.println("Students:");
        System.out.println(studentname);
        System.out.println();
        System.err.println(studentname.get(1) + " will receive a special award");//get the first index
        System.out.println(studentname.size());//size of a studentname variable

        //Access an Item studentname.get(index: number only);
        //Change an Item studentname.set(index: number, and a " " name);
        //Remove an Item studentname.remove(index number only); 
        //Clear an Item studentname.clear();
        //Size to count an Item studentname.size(); such as for loops



        ArrayList<Student> sts = new ArrayList<Student>();
        //in this case there are two types of instantation
        
        sts.add(new Student("Bumble Bee", "Bee"));//declared inside in method without print
        sts.add(new Student("Mirage", "Dino"));
        sts.get(1).introduce(); 

        Student sts2 = new Student("Optimus Prime", "The Last Prime");//declared with instance name or variable with print
        //sts.add(otherway);
        sts2.introduce();
        /* 
        for (Student student : sts2) {
            student.introduce();  // Call the introduce() method for each Student in the ArrayList
            System.out.println();  // Add an empty line after each student's introduction for readability
        }
        */

    }
}
class Student{
    String name;
    String nickname;
    Student(String name, String nickname){
        this.name = name;
        this.nickname = nickname;
    }
    void introduce(){
        System.out.println("Name: "+name);
        System.out.println("Nickname: "+nickname);
    }
}