package Recursion;
import java.util.*;
public class arr_sum_evenORodd{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int zero = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int even = arreven(arr, zero);
        int odd = arrodd(arr, zero);
        System.out.println("The array: " + Arrays.toString(arr));
        System.out.println("sum of all even numbers: "+even);
        System.out.println("sum of all even numbers: "+odd);
    }
    static int arreven(int[] arr, int zero){
        for(int i = 0; i <= arr.length; i++){
            if(i % 2 == 0){
                zero += i; //sum of all even num
                
            }
            //zero += i; //sum of all array
        }
        return zero;
    }
    static int arrodd(int[] arr, int zero){
        for(int i = 0; i <= arr.length; i++){
            if(i % 2 == 1){
                zero += i;
            }
            //zero += i; //sum of all array
        }
        return zero;
    }
}
