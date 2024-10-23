package Compro2;
import javax.swing.*;
import java.util.*;
public class LabExer1A {
    private String faveCartChar;
    private int faveNumber;
    private char mi;
    private char[] nickNameArray;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        LabExer1A obj = new LabExer1A();
        System.out.print("Enter your fave number: ");
        obj.faveNumber = s.nextInt();
        System.out.print("Enter your fave Character: ");
        obj.faveCartChar = s.next();
        System.out.println("Enter your SurName: ");
        String fname = s.next();
        String surname = fname.substring(0, 1).toUpperCase()+fname.substring(1);
        System.out.println("Enter your Initial: ");
        obj.mi = s.next().charAt(0);
        System.out.println("Enter your Last Name: ");
        String lname = s.next();
        String lastname = lname.substring(0, 1).toUpperCase()+lname.substring(1);
        System.out.print("Enter your nickname: ");
        String nickname = s.next();
        obj.nickNameArray = nickname.toCharArray();
System.out.println();
        System.out.println(obj.faveNumber + " is my favorite number.");

        System.out.println("I Love "+ obj.faveCartChar + "!");

        System.out.println("My name is "+ surname + " " + Character.toUpperCase(obj.mi) + ". " + lastname);
        System.out.print("you can call me ");
        for(char all : obj.nickNameArray){
            System.out.print(all);
        }
    }
}