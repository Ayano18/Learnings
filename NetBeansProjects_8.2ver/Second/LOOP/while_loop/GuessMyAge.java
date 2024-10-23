/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOOP.while_loop;

/**
 *
 * @author Timot
 */
import java.util.Scanner;
public class GuessMyAge {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Guess How Old I am: ");
            int age = 18;
            int ans = s.nextInt();
            if(ans == age){
                System.out.println("correct");
                break;
            } else {
                System.out.println("wrong");
                continue;
            }
        }
    }
}