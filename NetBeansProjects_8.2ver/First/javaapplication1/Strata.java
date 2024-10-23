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
import java.util.Scanner;
public class Strata {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Sample Size: ");
        double sam = scanner.nextDouble();
        System.out.println();
        System.out.println("Enter a Total Population: ");
        double pop = scanner.nextDouble();
        System.out.println();
        System.out.println("Enter a sub-population: ");
        double sub = scanner.nextDouble();
        System.out.println();
        System.out.println("Sample Size: "+sam);
        System.out.println("Total Population: "+pop);
        System.out.println("Sub-Population: "+sub);
        System.out.println();
        System.out.println("Sample Size / Total Population * Sub-Population");
        double all = (sam / pop) * sub;
        System.out.println("Result: "+all);
    }
}
