package Recursion;
import java.util.*;

public class RemoveMultipleElement{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arrs[] = {0,1,2,3,2,1,0};
        int targets = 2;
        Arrays.sort(arrs);
        System.out.println(Arrays.toString(arrs));
        int k = RemoveSpecificIndex(arrs, targets);
        for (int i = 0; i < k; i++) {
            System.out.print(arrs[i] + " ");
        }
        
    }
    public static int RemoveSpecificIndex(int[] arrs, int targets) {
        int k = 0; 
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] != targets) {
                arrs[k] = arrs[i];
                k++;
            }
        }
        return k; 
    }
}