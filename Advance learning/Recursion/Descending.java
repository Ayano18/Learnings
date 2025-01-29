package Recursion;
import java.util.*;

public class Descending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers from the user
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble();

        // Find the greatest number
        double greatestNumber = findGreatest(num1, num2, num3);

        // Print the numbers in descending order
        System.out.println("Numbers in descending order: ");
        if (greatestNumber == num1) {
            System.out.println(num1 + ", " + Math.max(num2, num3) + ", " + Math.min(num2, num3));
        } else if (greatestNumber == num2) {
            System.out.println(num2 + ", " + Math.max(num1, num3) + ", " + Math.min(num1, num3));
        } else {
            System.out.println(num3 + ", " + Math.max(num1, num2) + ", " + Math.min(num1, num2));
        }

        scanner.close();
    }

    // Function to find the greatest number among three
    private static double findGreatest(double num1, double num2, double num3) {
        return Math.max(Math.max(num1, num2), num3);
    }
}

