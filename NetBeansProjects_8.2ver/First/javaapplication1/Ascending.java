package javaapplication1;

import java.util.*;
public class Ascending {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Numbers nums = new Numbers();
    }
}
class Numbers{
    Scanner s = new Scanner(System.in);
    int one, two, three;
    Numbers(){
        System.out.println("Enter the first number:");
        one = s.nextInt();
        System.out.println("Enter the second number:");
        two = s.nextInt();
        System.out.println("Enter the third number:");
        three = s.nextInt();
        int all = combine(one, two, three);
        //System.out.println(Math.min(Math.min(one, two), three));
        if(all == one){
            System.out.println(one + " " + Math.min(two, three) + " " + Math.max(two, three));
        } else if(all == two){
            System.out.println(two + " " + Math.min(one, three) + " " + Math.max(one, three));
        } else {
            System.out.println(three + " " + Math.min(one, two) + " " + Math.max(one, two));
        }
        
    }

    public int combine(int one, int two, int three){
        return Math.min(Math.min(one, two), three);
    }
}
/*
 * public class AscendingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.print("Enter three   
 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Ascending order: " + Arrays.toString(numbers));
    }
}
 */

 /*
  * public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();   


        int smallest = Math.min(Math.min(num1, num2), num3);
        int largest = Math.max(Math.max(num1, num2), num3);
        int middle = num1 + num2 + num3 - smallest - largest;

        System.out.println("Ascending order: " + smallest + ", " + middle + ", " + largest);
    }
}
  */

  /*
   * import java.util.Scanner;

public class AscendingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Sort num1 and num2
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Sort num2 and num3
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Sort num1 and num2 again (if necessary)
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Ascending order: " + num1 + ", " + num2 + ", " + num3);
    }
}
   */