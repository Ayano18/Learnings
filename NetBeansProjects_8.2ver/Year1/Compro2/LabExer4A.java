package Compro2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timot
 */

import java.util.*;

public class LabExer4A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the employee: ");
        String name = scanner.nextLine();
        System.out.println("Press F for Full Time or P for Part Time: ");
        char choice = scanner.next().charAt(0);
        Employee employee;
        if (Character.toUpperCase(choice) == 'F') {
            System.out.println("Enter the monthly salary: ");
            double monthlySalary = scanner.nextDouble();
            employee = new FullTimeEmployee(name, monthlySalary);
        } else if (Character.toUpperCase(choice) == 'P') {
            System.out.println("Enter the rate per hour and the number of hours worked: ");
            double ratePerHour = scanner.nextDouble();
            int hoursWorked = scanner.nextInt();
            employee = new PartTimeEmployee(name, ratePerHour, hoursWorked);
        } else {
            System.out.println("Invalid choice. Exiting...");
            return;
        }
        System.out.println("Employee Name: " + employee.getName());
        if (employee instanceof FullTimeEmployee) {
        System.out.println("Wage: " + ((FullTimeEmployee) employee).getWage());
    } else if (employee instanceof PartTimeEmployee) {
        System.out.println("Wage: " + ((PartTimeEmployee) employee).getWage());
    }
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    //Override
    public String toString() {
        return "FullTimeEmployee{" +
                "name='" + getName() + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }

    public double getWage() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double ratePerHour;
    private int hoursWorked;

    public PartTimeEmployee(String name, double ratePerHour, int hoursWorked) {
        super(name);
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "name='" + getName() + '\'' +
                ", ratePerHour=" + ratePerHour +
                ", hoursWorked=" + hoursWorked +
                '}';
    }

    public double getWage() {
        return ratePerHour * hoursWorked;
    }
}
