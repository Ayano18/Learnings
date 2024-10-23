package Compro1;
import java.util.*;
/**
 *
 * @author Timot
 */
public class TGLA_06_TaskPerformance_01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of males: ");
        double males = scanner.nextDouble();
        System.out.println("Enter the number of females: ");
        double females = scanner.nextDouble();
        double all = males + females;
        
        double male = (males / all) * 100;
        double female = (females / all) * 100;
        
        System.out.println("Enter the number of males: " + males);
        System.out.println("Enter the number of females: " + females);
        System.out.println("Number of students = " + all);
        System.out.printf("Male = %.2f%%", male);
        System.out.println();
        System.out.printf("Female = %.2f%%", female);
        
        
    }
}
