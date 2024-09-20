import java.util.*;

public class MutualUnderstanding {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = s.nextInt();

        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        s.close();
    }
//Boolean to identify whether even or odd the number
    public static boolean isEven(int n) {
        if (n == 0) {
            return true;
        } else {
            return isOdd(n - 1);
        }
    }

    public static boolean isOdd(int n) {
        if (n == 0) {
            return false;
        } else {
            return isEven(n - 1);
        }
    }
}
