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
public class NewClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double a = 256;
        int b = 2;
        double c = Math.sqrt(a);
        System.out.println(c);
        System.out.println();
        
        double x;
        double y;
        double z;
        
        System.out.println("Enter x: ");
        x = scanner.nextDouble();
        
        System.out.println("Enter y: ");
        y = scanner.nextDouble();
        
        z = (x*x)+(y*y);
        
        System.out.println(z);
                        
    }
}
/*
public class NewClass {
    public static void main(String[] args)throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int j = 150;
        String s = "One Two Three Four Five";
        for(int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i));
            Thread.sleep(500);
        }
    }
}
*/

