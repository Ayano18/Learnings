/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timot
 */
import java.util.Scanner;
public class calcu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int gege = 1;
        System.out.println("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter a another number: ");
        int num2 = scanner.nextInt();
        System.out.println("");
        System.out.println("1st number is "+num1 +", and the "+"2nd number is "+num2);
        System.out.println("");
        switch (gege){
            case 1:
                System.out.println(num1 + num2);
                System.out.println("");
            case 2:
                System.out.println(num1 - num2);
                System.out.println("");
            case 3:
                System.out.println(num1 * num2);
                System.out.println("");
            case 4:
                System.out.println(num1 / num2);
                System.out.println("");
                break;
            default:
                System.out.println("ge");
        }
    }
}
