/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condition;

/**
 *
 * @author Timot
 */
import java.util.Scanner;
public class Age {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        if (age <= 12){
            System.out.println("You are a teen");
        }
        else if (age <= 17) {
            System.out.println("You are a teenager");
        }
        else if (age <= 22) {
            System.out.println("You are a adolescent");
        }
        else if (age <= 59) {
            System.out.println("You are a young adult or adult");
        } 
        else if (age <= 100) {
            System.out.println("You are a senior");
        } else {
            System.out.println("u r dead");
        }
    }
}