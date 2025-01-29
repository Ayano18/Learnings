package Recursion;
import java.util.*;
public class reverseSTR {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String all = strs("babae", "");
    }
    static String strs(String orig, String reverse){
        for(int i = 0; i < orig.length(); i++){
            reverse = orig.charAt(i) + reverse;
            System.out.println(reverse);
        }
        
        return reverse;
    }
}
