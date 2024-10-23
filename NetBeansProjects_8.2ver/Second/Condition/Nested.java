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
public class Nested {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature");
        int temp = scanner.nextInt();
        
        if (temp >= 50)
            if (temp >= 100){
                System.out.println("hot");
            }
            else {
                System.out.println("warm");
            }
        else {
            System.out.println("cold");
        }
    }
}
