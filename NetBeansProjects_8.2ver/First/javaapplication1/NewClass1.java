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
public class NewClass1 {
    public static void main(String[] args) {

        int lines = 7; 

        int half = lines/2;
        boolean even = false;
        String carat = ">";
        int i;

        if(lines%2==0){even = true;} //if it is an even number, remainder will be 0

        for(i=1;i<=lines;i++){
                System.out.println(carat + "\n");                           
                if(i==half && even){
                    System.out.println(carat+"\n");
                } // print the line again if this is the middle number and the number of lines is even
                if(((i>=half && even) || (i>=half+1)) && i!=lines){ // in english : if the number is even and equal to or over halfway, or if it is one more than halfway (for odd lined output), and this is not the last time through the loop, then lop 2 characters off the end of the string
                        carat = carat.substring(0,carat.length()-2); 
                }else{ 
                        carat = carat + ">>"; //otherwise, going up
                }
        }
    }
}