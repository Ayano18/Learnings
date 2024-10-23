package Compro2;
import java.util.*;
public class LabExer5A{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int guess;
        int attempts = 0;
        System.out.println("Guess a number from 1 to 50!");
        
        try{
            while(true){
                guess = s.nextInt();
                attempts++;
                int num = 5;
               if(guess == num){
                System.out.println("You got it in " + attempts + " attempts");
                break;
               }
               else if(guess >= 51){
                System.out.println("out of range");
               }
               else if(guess > num){
                System.out.println("too high");
               }
               else if(guess < num){
                System.out.println("too low");
               }
            }
        }
        catch(InputMismatchException a){
            System.out.println("Invalid input");
        }
    }
}