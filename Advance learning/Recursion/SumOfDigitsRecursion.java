package Recursion;

import java.util.*;
public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int sum = sumOfDigitsRecursive(num);
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }

    public static int sumOfDigitsRecursive(int num) {
        if (num == 0) {
            return 0;
        } else {
            return (num % 10) + sumOfDigitsRecursive(num / 10);
        }
    }
}
/*

private static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Extract and add the last digit
            num /= 10;       // Remove the last digit
        }
        return sum;
    }
}

 */
