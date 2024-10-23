/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Timot
 */
public class NewClass2 {
    public static void main(String[] args){
        int lines = 10; //the number of lines
        String carat = ">";
        int i;
        for(i=1;i<=lines;i++){
        System.out.println(carat + "\n"); // last part for a newline
        carat = carat + ">>";
    }
    }
}
