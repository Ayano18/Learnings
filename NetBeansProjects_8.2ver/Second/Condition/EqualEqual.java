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
public class EqualEqual {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = 15;
        int num2 = 15;
        if (num1 == num2){
            System.out.println("Equal");
        } else {
            System.out.println("Is not equal");
        }
    }
}
