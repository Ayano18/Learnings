package Condition;
/**
 *
 * @author Timot
 */
import java.util.Scanner;
public class Choice {

    /**
     * @param agrs
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Would you like to continue?");
        System.out.println("YES or NO");
        
        String choice = scanner.nextLine();
        
        if (choice.equalsIgnoreCase("YES")){
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            System.out.println("welcome to java " + name);
        } else if (choice.equalsIgnoreCase("NO")) {
            System.out.println("Exiting program, K!");
        } else {
            System.out.println("Invalid choice, Exiting program");
        }
    }
}