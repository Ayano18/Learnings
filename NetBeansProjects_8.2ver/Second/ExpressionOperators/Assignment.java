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
public class Assignment {
    public static void main(String[] args){
        int numnum = 10;
        int num = 20;
        System.out.println(num+=2);
        System.out.println(num-=2);
        System.out.println(num*=2);
        System.out.println(num/=2);
        System.out.println(num%=2);
        System.out.println(num++);
        System.out.println(num--);
        System.out.println("----------------------");
        numnum++;
        System.out.println(numnum);
    }
}
