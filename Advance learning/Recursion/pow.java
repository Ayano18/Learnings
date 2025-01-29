package Recursion;
import java.util.*;
public class pow {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int all = nums(4, 4);
        System.out.println(all);
    }
    static int nums(int one, int two){
        double powpow = Math.pow(one, two);
        System.out.print(one + " raised to the power of " + two + " is ");
        return (int) powpow;
    }
}

