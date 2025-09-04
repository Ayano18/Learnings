import java.util.*;
public class leet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Roman Numerals: I, V, X, L, C, D, M");
        String n = s.next().toUpperCase();
        int a = romanToInt(n);
        System.out.println(a);
        
    }
    
    public static int romanToInt(String n) {
        if(n.equals("I")){
            return 1;
        } if(n.equals("V")){
            return 5;
        } if(n.equals("X")){
            return 10;
        } if(n.equals("L")){
            return 50;
        } if(n.equals("C")){
            return 100;
        } if(n.equals("D")){
            return 500;
        } if(n.equals("M")){
            return 1000;
        }
        return romanToInt(n);
    }
}