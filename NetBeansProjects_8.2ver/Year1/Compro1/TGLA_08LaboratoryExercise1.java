package Compro1;
import java.util.Scanner;
/**
 *
 * @author Timothy
 */
public class TGLA_08LaboratoryExercise1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int fact; int num = 1;
        System.out.print("Enter a number integer: ");
        fact = s.nextInt();
        System.out.print(" "+fact+"! = ");
        for (int i = 1; i <= fact; i++){
            
            if (i<fact){
                System.out.print(i+" x ");
            } else {
                System.out.print(i);
            }
            num = num * i;
        }
        if (fact<=0){
        System.out.println("Invalid Input! Program Stopped!");
        
        } else {
            System.out.println();
            System.out.println(" The factorial of "+fact+" is: "+num);
        }
    }
}
