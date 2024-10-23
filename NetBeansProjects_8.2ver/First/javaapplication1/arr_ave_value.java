package javaapplication1;
import java.util.*;
public class arr_ave_value {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        int length = arr.length;
        System.out.println("The value of array: ");
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            sum = arr[i] += sum;
        }
        System.out.println("The length of array: ");
        System.out.println(length);
        System.out.println("The sum of all array:");
        System.out.println(sum);
        double average = sum / length;
        System.out.println("The average value of array is: ");
        System.out.println(average);
    }
}
