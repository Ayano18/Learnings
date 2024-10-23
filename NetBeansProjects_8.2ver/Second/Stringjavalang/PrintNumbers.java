/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stringjavalang;

/**
 *
 * @author Timot
 */
import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char flag = 'y';
        int range;

        while (flag == 'y') {
            System.out.print("Enter the range of loop greater than 0: ");
            range = s.nextInt();

            if (range > 0) {
                for (int i = 1; i <= range; i++) {
                    // Print the number and a space only if not the last iteration
                    if (i < range) {
                        System.out.print(i + ", ");
                    } else {
                        System.out.print(i);
                    }
                }
                System.out.println(); // Add newline after printing numbers
            } else {
                System.out.println("Invalid number. Try again!");
                continue;
            }

            System.out.print("\nRepeat the program? (y/n): ");
            flag = s.next().charAt(0);
        }

        if (flag == 'n') {
            System.out.println("Ty");
        } else {
            System.out.println("wrong input");
        }
    }
}
