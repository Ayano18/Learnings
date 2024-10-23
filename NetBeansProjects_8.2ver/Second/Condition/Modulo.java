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
public class Modulo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number if even or odd: ");
        int number = scanner.nextInt();
        //int number = 20;
        if (number % 2 == 0){ //modulo is use for remainder if even number (e.g 2, 4, 6, 8, 10....) else odd number (e.g 1, 3, 5, 7, 9....)
            System.out.println(number +" even number");
        } else {
            System.out.println(number +" odd number");
        }
        scanner.close();
    }
}
