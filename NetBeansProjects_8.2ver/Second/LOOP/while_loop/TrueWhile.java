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
public class TrueWhile {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("5 multiply by 5?: ");
            int prob = 5 * 5;
            int ans = s.nextInt();
            if(ans == prob){
                System.out.println("correct");
                break;
            } else {
                System.out.println("wrong");
                continue;
            }
        }
    }
}
