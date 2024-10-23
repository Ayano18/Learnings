/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timot
 

import java.util.*;
public class Login {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        
        System.out.println("Hello "+name);
        System.out.println();
        
        System.out.println("Are u ready to go? ");
        System.out.print("Yes or No: ");
        String go = s.nextLine();
        
        if(go.equalsIgnoreCase("yes")){
            System.out.println();
        } else {
            System.out.println("OK"); 
        }
        System.out.println();
        System.out.println("Ride a motor");
        System.out.println("Press A to Enter or Z to Exit");
        while(true){
            
        String press = s.nextLine();
        System.out.println();
        if(press.equalsIgnoreCase("A")){
            System.out.println("Arriving at Waiting Shed");
            for(int i = 0; i <= 5; i++){
                int a = i;
                String dot = ".";
                while(a<5){
                    a++;
                    System.out.print(dot.charAt(0));
                    try{
                        Thread.sleep(400);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println();
            }
            System.out.println("Successfully Arrived!");
        } else {
            System.out.println();
            break;
        }
        System.out.println("");
        
        
        System.out.println("Press 0 to ride Tricycle");
        System.out.println("Press 1 to ride Jeep");
        System.out.println("Press 2 to ride Ceres");
        
        System.out.print(":");
        int pili = s.nextInt();
        switch(pili){
            case 0:
                System.out.println();
                System.out.println("Arriving at Terminal");
                for(int j = 0; j < 5; j++){
                    int b = j;
                    String dot1 = ".";
                    while(b<5){
                        b++;
                        System.out.print(dot1.charAt(0));
                        try{
                            Thread.sleep(800);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                    System.out.println();
                    System.out.println("Press A to ride another tricycle or Z to walk");
                    System.out.print(":");
                    String another = s.next();
                    if(another.equalsIgnoreCase("A")){
                        for(int k = 0; k < 5; k++){
                            int c = k;
                            String dot2 = ".";
                            while(c<5){
                                c++;
                                System.out.print(dot2.charAt(0));
                                try{
                                    Thread.sleep(800);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        System.out.println();
                        System.out.println("Welcome to school");
                        break;
                    } else {
                        System.out.println("Goodluck malala!");
                    }
                break;
            case 1:
                System.out.println();
                System.out.println("Arriving at Terminal");
                for(int l = 0; l <= 5; l++){
                    int d = l;
                    String dot3 = ".";
                    while(d<5){
                        d++;
                        System.out.print(dot3.charAt(0));
                        try {
                         Thread.sleep(1000);
                    } catch (InterruptedException e) {
                         e.printStackTrace();
                    }
                    }
                }
                System.out.println();
                System.out.println("Press A to ride a tricycle");
                System.out.print(":");
                String tric = s.next();
                if(tric.equalsIgnoreCase("A")){
                    for(int m = 0; m < 5; m++){
                        int d = m;
                        String dot4 = ".";
                        while(d<5){
                            d++;
                            System.out.print(dot4.charAt(0));
                            try {
                            Thread.sleep(800);
                        } catch (InterruptedException e){
                              e.printStackTrace();
                        }
                        }
                    }
                    System.out.println();
                    System.out.println("Welcome to School");
                } else {
                    System.out.println("Try Again");
                    continue;
                }
                break;
            case 2:
                System.out.println();
                System.out.println("Arriving at school");
                for(int n = 0; n <= 5; n++){
                    int f = n;
                    String dot5 = ".";
                    while(f<5){
                        n++;
                        System.out.print(dot5.charAt(0));
                        try {
                            Thread.sleep(800);
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println();
                System.out.println("Welcome to School");
                break;
            default:
                System.out.println("invalid input");
                continue;
        }
        }
    }

}
//System.out.println();
*/
import java.util.Scanner;

public class Bank {
  static double balance = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int option = 0;
    while (option != 4) {
      System.out.println("Welcome to the Bank of Java");
      System.out.println("1. Check Balance");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Exit");
      System.out.print("Enter an option: ");
      option = scanner.nextInt();

      switch (option) {
        case 1:
          checkBalance();
          break;
        case 2:
          deposit();
          break;
        case 3:
          withdraw();
          break;
        case 4:
          exit();
          break;
        default:
          System.out.println("Invalid option. Try again.");
          break;
      }
    }
  }

  public static void checkBalance() {
    System.out.println("Your current balance is $" + balance);
  }

  public static void deposit() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the amount to deposit: $");
    double amount = scanner.nextDouble();
    balance += amount;
    System.out.println("$" + amount + " has been deposited to your account.");
    checkBalance();
  }

  public static void withdraw() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the amount to withdraw: $");
    double amount = scanner.nextDouble();
    if (amount > balance) {
      System.out.println("Insufficient funds.");
    } else {
      balance -= amount;
      System.out.println("$" + amount + " has been withdrawn from your account.");
    }
    checkBalance();
  }

  public static void exit() {
    System.out.println("Thank you for banking with us. Have a great day!");
  }
}