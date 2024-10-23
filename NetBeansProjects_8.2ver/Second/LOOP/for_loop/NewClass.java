/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOOP.for_loop;

/**
 *
 * @author Timot
 */
public class NewClass {
    public static void main(String[] args){
        int x, y;
        System.out.println("Multiplication Table of 1-10:");
        for (x = 1; x <= 10; x++) {
        for (y = 1; y <= 10; y++) {
        System.out.print(x * y + "\t");
    } //end of inner for loop
        System.out.println();
        } //end of outer for loop
    }
}
