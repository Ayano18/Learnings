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
import java.util.Scanner;
public class TwoDimenArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[][] array = new int[2][2];
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;
        System.out.print("choose 0-1: ");
        int input1 = s.nextInt();
        System.out.print("choose 0-1: ");
        int input2 = s.nextInt();
        System.out.println(array[input1][input2]);
        
        
        
        /*
        int[][] table = {
            {1, 2, 3, 4, 5},
            {2, 4, 6, 8, 10},
            {1, 3, 5, 7, 9}
        };
        System.out.println(table[1][4]);//output 10
        
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                System.out.print(table[i][j]+"\t");
            }
            System.out.println();
            }
        */
        
        
        /*
        int[][][] numbers = {
        {
        {1, 3, 5, 7, 9},
        {11, 13, 15, 17, 19},
        {21, 23, 25, 27, 29}
        },
        {
        {2, 4, 6, 8, 10},
        {12, 14, 16, 18, 20},
        {22, 24, 26, 28, 30}
        }
        };
        System.out.println(numbers[0][2][4]); //returns 29
        System.out.println(numbers[1][2][4]); //returns 30
        */
    }
}
