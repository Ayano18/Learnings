/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionOperators;

/**
 *
 * @author Timot
 */
public class Logical {
    public static void main(String[] args){
        //and &&
        //or ||
        //bitwise ^
        //not !
        int a = 1, b = 2;
        System.out.println(a > b && a < b);
        System.out.println(a > b || a < b);
        System.out.println(a > b ^ a < b);
        System.out.println((a > b) || a < b);
    }
}
