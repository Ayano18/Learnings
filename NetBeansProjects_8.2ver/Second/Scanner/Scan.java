/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;

/**
 *
 * @author Timot
 */
import java.util.Scanner;

public class Scan {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter Age: ");
        int age = scanner.nextInt();
        
        System.out.println("Enter GPA: ");
        float num = scanner.nextFloat();
        
        scanner.nextLine();
        
        System.out.println("Enter your fave food: ");
        String food = scanner.nextLine();
        
        
        System.out.println();
        System.out.println("Hello " + name + " Nice to meet you");
        System.out.println("You are " + age + " years old" + " and you're young huh!");
        System.out.println("So your GWA is " + num + " that's quite impressive!!");
        System.out.println("I like " + food + " too!!");
        System.out.println("Thank you!!!");
        
        
        scanner.close();
    }
}