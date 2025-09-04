import java.util.*;
public class leetcode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 8;
        System.out.println(mySqrt(num));
        
    }
    public static int mySqrt(int x) {
        int call = (int) Math.sqrt(x);
        return call;
    }
}
