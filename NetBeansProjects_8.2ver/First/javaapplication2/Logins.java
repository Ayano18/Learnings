/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timot
 */
import java.util.*;
public class Logins {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Loginout log = new Loginout();
    }
}
class Loginout{
    Scanner s = new Scanner(System.in);
    Loginout(){
        System.out.println("Welcome");
        System.out.println("Press 1 to login");
        System.out.println("Press 2 to sign in");
        System.out.print(": ");
        int num = s.nextInt();
        if(num == 1){
            System.out.println("1: ");
            Log();
        } else if (num == 2){
            System.out.println("2: ");
            Sign();
        } else {
            System.out.println("Wrong input");
        }
    }
    void Log(){
        System.out.print("Enter your user: ");
        String user = s.next();
        System.out.print("Enter your pass: ");
        String pass = s.next();
        System.out.print("Validating");
        for(int i = 0; i <= 5; i++){
            String dot = ".";
            try{
                System.out.print(dot.charAt(0));
                Thread.sleep(400);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("INFO ACQUIRED");
    }
    void Sign(){
        System.out.print("Enter user: ");
        String user = s.next();
        System.out.print("Enter pass: ");
        String pass = s.next();
        if(user.equalsIgnoreCase("admin")){
            System.out.println();
            if(pass.equalsIgnoreCase("admin123")){
                System.out.println("Welcome");
            } else {
                System.out.println("Wrong password");
            }
        } else {
            System.out.println("Wrong user");
        } 
    }
}