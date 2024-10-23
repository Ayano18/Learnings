package Compro2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timothy
 */
import java.util.*;

public class LabExer8A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your student number: ");
        String studentNumber = scanner.nextLine();

        if (isValidStudentNumber(studentNumber)) {
            System.out.println("\nYou have successfully logged in.\nWelcome to your new dashboard!");
        } else {
            System.out.println("\nInvalid student number. Please enter a valid student number.");
        }

        scanner.close();
    }

    private static boolean isValidStudentNumber(String studentNumber) {
        String regex = "\\d{4}-\\d{2}-\\d{3}";
        return studentNumber.matches(regex);
    }
}

