package Condition;
/**
 *
 * @author Timot
 */
import java.util.*;
public class Inputnum {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter a number: ");
        int num = 1;
        while (num <= 50){
            if(num%10==0){
                System.out.println(num);
            }
            num++;
        }
    }
}
