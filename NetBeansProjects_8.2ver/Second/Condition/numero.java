/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condition;

/**
 *
 * @author Timot
 */
public class numero{
    public static void main(String[] args){
        //and &&
        //or ||
        //bitwise ^
        //not !
        int a = 1, b = 2, c = 3, d = 4;
        if (a > b && c < d){
            System.out.println("statement 1");
        }
        else if (a < b || c > d){
            System.out.println("statement 2");
        } else {
            System.out.println("none");
        }
    }
}