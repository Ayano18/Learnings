/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

/**
 *
 * @author Timot
 */
import java.util.Scanner;
public class RateMeSwitch {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Rate me: ");
        int rate = s.nextInt();
        switch(rate){
            case 0:
                
            case 1:
                System.out.println("u are a horrible");
                break;
            case 2:
                
            case 3:
                
            case 4:
                System.out.println("how bad u are");
                break;
            case 5:
                
            case 6:
                System.out.println("acceptable");
                break;
            case 7:
                System.out.println("hmmmmm, damn");
                break;
            case 8:
                
            case 9:
                
            case 10:
                System.out.println("Appreciated");
                break;
            default:
                if(rate < 0 || rate >= 11){
                    System.out.println("wrong input!");
                    System.out.println("it should be 1-10");
                }
        }
    }
}
