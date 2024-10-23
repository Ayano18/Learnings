/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sauce;

/**
 *
 * @author Timot
 */
import java.util.Scanner;
public class Third {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        /*
        int[][] table = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };
        /*
        for(int y = 0; y < 3; y++){
            for(int z = 0; z < 5; z++){
                System.out.print(table[y][z]+"\t");
            }
            System.out.println();
        }
        
        for(int a = 0; a < table.length; a++){
            for(int b = 0; b < table[a].length; b++){
                System.out.print(table[a][b]+"\t");
            }
            System.out.println();
        }
        */
        
        
        sumsum(8,7);
        int num = sumsum(5, 5);
        System.out.println(num+1);
    }
    public static int sumsum(int x, int y){
        int sum;
        sum = x + y;
        System.out.println(sum);
        return sum;
        
    }
}
