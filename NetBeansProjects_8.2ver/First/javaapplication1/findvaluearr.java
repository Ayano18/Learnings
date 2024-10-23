package javaapplication1;
import java.util.*;
public class findvaluearr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int index = 5;
        System.out.println("The indexed element "+ index + " is " +"\nIndexed: " +FindSpecificIndex(arr, index));
        //findIndexUsingEnhancedFor(arr, index);
    }
    public static int FindSpecificIndex(int[] arr, int target) {
        int index = 0;
        for (int element : arr) {
            if (element == target) {
                return index;
            }
            index++;
        }
        return -1;
    }
}
