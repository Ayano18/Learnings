package Recursion;
import java.util.*;
public class Fact {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int all = num(1, 5);
        System.out.println("Factorial of 5 is "+all);
    }
    public static int num(int one, int range){
    for(int i = 1; i <= range; i++){
        one = one * i;
    }
    return one;
    }
}
