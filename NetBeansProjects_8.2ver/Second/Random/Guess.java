/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Random;

/**
 *
 * @author Timot
 */
import java.util.Scanner;
import java.util.Random;
public class Guess {
    public static void main(String[] args){
        Random random = new Random();
        int number = random.nextInt(10);
        int guess = -1;
        Scanner scanner = new Scanner(System.in);
        while (guess != number){
            System.out.println("Your try:");
            guess = scanner.nextInt();
            if (guess > number)
                System.out.println("high");
            if (guess < number)
                System.out.println("low");
        }
        scanner.close();
        System.out.println("Congrats you guessed!");
    }
}
