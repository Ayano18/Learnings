import java.util.*;
public class parameter{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println();
        Person p = new Person("Rick", "Morty", 15, 'M');
        Person p1 = new Person("Spongebob", "Patrick", 20, 'F');
        p.PtalkP1(p1);//p talk to p1
        System.out.println();
        System.out.println(p.talking(p1));

        agoi ar = new agoi();
    }
}
class Person{
    String surName;
    String lastName;
    int age;
    char sex;
    Person(String surName, String lastName, int age, char sex){
        this.surName = surName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    //void method
    void PtalkP1(Person a) //Person a is parameter passing which is p1
    {
        System.out.println(surName + ": "+ "Hello "+ a.surName);
    }

    //return specific method such as String or int or etc
    String talking(Person b) //Person a is parameter passing which is p1
    {
        return surName + " " + b.lastName;
    }
}
class agoi{
    agoi(){
        System.out.println();

        int[] table = {1, 2, 3, 4, 5};

        /*
        for(int all : table){
            System.out.println(all);
        }
         
        for(int i = 0; i < table.length; i++){
            System.err.println(table[i]);
        }
        */

        int[][] two = {
            {1,2,3,4,5},
            {2,4,6,8,10},
            {1,3,5,7,9}
        };
        System.out.println(two[1][4]);
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 1; col++){
                System.out.print(two[row][col]);
            }
            System.out.println();
        }
    }
}