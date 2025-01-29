package Recursion;
import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int all = sums(10, 0);
        System.out.println(all);
    }
    static int sums(int num, int zero){
        for(int i = 0; i <= num; i++){
            zero += i;
        }
        return zero;
    }
}
