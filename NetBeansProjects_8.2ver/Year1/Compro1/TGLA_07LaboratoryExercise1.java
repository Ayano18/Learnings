package Compro1;

import java.util.Scanner;
public class TGLA_07LaboratoryExercise1 {
    public static void main(String[] agrs){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = s.nextLine();
        System.out.print("Press F for Full Time or P for Part Time: ");
        char choice = s.next().charAt(0);
        if (choice == 'F' || choice == 'f'){
            System.out.println("----- FULL TIME EMPLOYEE -----");
            System.out.print("Enter Basic Pay: ");
            double monthly = s.nextDouble();
            System.out.println("___________________________________");
            System.out.println("Employee Name: "+name);
            System.out.println("Basic Pay: "+monthly);
            System.out.println("___________________________________");
            System.out.println("Gross Pay: "+monthly);
        }
       else if (choice == 'P' || choice == 'p'){
            System.out.println("----- PART TIME EMPLOYEE -----");
            System.out.print("Enter rate per hour: ");
            double rate = s.nextDouble();
            System.out.print("Enter no. of hours worked: ");
            double work = s.nextDouble();
            System.out.print("Enter no. of overtime: ");
            double overtime = s.nextDouble();
            System.out.println("___________________________________");
            System.out.println("Employee Name: "+name);
            double ratework = rate * work;
            System.out.println("Basic Pay: "+ ratework);
            double all = rate * overtime * 1.25;
            System.out.println("Overtime Pay: "+ all);
            System.out.println("___________________________________");
            double overall = ratework + all;
            System.out.println("Gross Pay: " + overall);
        } else {
            System.out.println("ERROR");
        }
    }
}
