package javaapplication1;
import java.util.*;
public class rowcol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] row = new int[10];
        int[] col = new int[10];

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < col.length; j++) {
                System.out.print(row[i] + col[j] + " ");
            }
            System.out.println();
        }
    }
}
