package javaapplication1;
import java.util.*;
public class specificarr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int num = 5;

        boolean found = tof(num, arr);
        System.out.println(found);
    }
    public static boolean tof(int num, int[] arr){

        for(int element : arr){
            if(num == element){
                return true;
            }
        }
        return false;
    }
}
