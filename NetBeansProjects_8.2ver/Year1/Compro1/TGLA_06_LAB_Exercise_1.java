package Compro1;

import java.util.Scanner;
/**
 *
 * @author Timot
 */
public class TGLA_06_LAB_Exercise_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the base attack speed: ");//0.658
        double speed = scanner.nextDouble();
        
        System.out.println("Enter the bonus attack speed: ");//4
        double bonus = scanner.nextDouble() / 100;
        
        System.out.println("Enter the level: ");//10
        int level = scanner.nextInt();
        
        System.out.println("");
        System.out.println("base attack speed: "+speed);
        System.out.println("bunos attack speed: 4");
        System.out.println("level: "+level);
        System.out.printf("The character's current attack speed is: %.3f", speed*(1+(bonus*(level - 1))));
        System.out.println("");

    }
}
