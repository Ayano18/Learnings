
import java.util.Scanner;

/**
 *
 * @author Potato
 */
public class fact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int samp = 1;

        System.out.println("Enter a positive number: ");
        int count = input.nextInt();

        if (count <= 0) {
            System.out.println("Error! Please enter a positive integer. Program stopped!");
        } else {
            System.out.print(" " + count + "!= ");
            int i = 1;
            while (i <= count) {
                System.out.print(i);
                if (i < count) {
                    System.out.print(" x ");
                }
                samp = samp * i;
                i++;
            }
            System.out.println(" \n The factorial of " + count + " is: " + samp);
        }
}
}