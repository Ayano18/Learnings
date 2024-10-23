package Compro2;
import java.util.*;
public class LabExer1B{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = s.nextInt();
        
        System.out.println("20 plus 10 is: "+ showNumberPlus10(num));
        System.out.println("20 plus 100 is: "+ showNumberPlus100(num));
        System.out.println("20 plus 1000 is: "+ showNumberPlus1000(num));
    }

    public static int showNumberPlus10 (int number){
        return number + 10;
    }
    public static int showNumberPlus100 (int number){
        return number + 100;
    }
    public static int showNumberPlus1000 (int number){
        return number + 1000;
    }
    
}