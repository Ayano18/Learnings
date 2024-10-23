package Compro1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timot
 */
import java.util.Scanner;
public class TGLA_11LaboratoryExercise1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter mass in kilograms: ");
        double m = s.nextDouble();
        System.out.print("Enter velocity in meters per second: ");
        double v = s.nextDouble();
        double KineticEnergy = Recursion(m, v);
        System.out.printf("Kinetic Energy: %.2f J%n", KineticEnergy);
    }
    private static double Recursion(double m, double v){
        double v2 = Math.pow(v, 2);
        double mxv2 = m * v2;
        return 0.5 * mxv2;
        
    }
}
//System.out.println();