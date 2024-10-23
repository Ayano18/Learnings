/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Timot
 */
import java.util.*;
public class looponearray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[][] array = new int[2][2];
        for(int a = 0; a < 2; a++){
            for(int b = 0; b < 2; b++){
                System.out.println("Enter a number");
                array[a][b] = s.nextInt();
            }
        }
        System.out.println("Array values: ");
                for(int a = 0; a < 2; a++){
            for(int b = 0; b < 2; b++){
                System.out.print(array[a][b]+"\t");
            }
            System.out.println();
        }
    }
}