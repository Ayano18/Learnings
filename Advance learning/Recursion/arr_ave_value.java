package Recursion;
import java.util.*;
public class arr_ave_value {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int length = arr.length;
        System.out.println("The value of array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("The length of array: ");
        System.out.println(length);
        System.out.println("The sum of all array:");
        System.out.println(arrsum(arr));

    }
    public static int arrsum(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = arr[i] += sum;
        }
        return sum;
    }
}
