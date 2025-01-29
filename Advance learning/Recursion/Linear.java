package Recursion;

import java.util.Arrays;

public class Linear {
     static int LinearSearch(int[] arr, int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
     }
     public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int x = 9;
        int result = LinearSearch(arr, x);
        if(result == 0){
            System.out.println("not found");
        } else {
            System.out.println("found : "+result);
        }

        int arrs[] = {1, 10, 5, 7, 9};
        Arrays.sort(arrs);
        int n = arrs.length;
        System.out.println(arrs[n - 1]+" "+arrs[n - 2]+" "+arrs[n - 3]);
    }
}
