package Recursion;
import java.util.*;
public class StringChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(printing(str));
    }
    public static String printing(String ml){
        for(int i = 0; i < ml.length(); i++){
            try{
                Thread.sleep(50);
                System.out.print(ml.charAt(i));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();//new line
        return "";
    }
}
