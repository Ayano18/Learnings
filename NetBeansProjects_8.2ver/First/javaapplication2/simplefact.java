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
public class simplefact {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int i, factorial = 1;
        int num = 5;
        //System.out.println("Enter a positive integer: ");
        //num = s.nextInt();
        for(i = 1; i <= num; i++){
            
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}