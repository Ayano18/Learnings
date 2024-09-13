import java.util.*;
public class Exceptions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Except ex = new Except();
        //ex.arith();
        //ex.mismatch();
        //ex.numformat();
        //ex.arr();
    }
}
class Except{
    Scanner s = new Scanner(System.in);

    void arith(){
        //ArithmeticExceptions
        try {
            
            int num1 = 0;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
        } catch (ArithmeticException a) {
            // TODO: handle exception
            System.out.println("Avoid typing 0");
            System.out.println("Division by zero is not allowed.");
        } finally {
            s.close();
        }
    }
    void mismatch(){
        try {
            System.out.print("Enter any Integer: ");
            int num = s.nextInt();
            System.out.println(num);
        } catch (InputMismatchException m) {
            // TODO: handle exception
            System.out.println("Wrong input it should be Integer");
        } finally {
            s.close();
        }
    }
    void numformat(){
        try {
            System.out.print("Enter a String Integer: ");
            String str = s.nextLine();
            int convert = Integer.parseInt(str);
            System.out.println(convert);
        } catch (NumberFormatException f) {
            // TODO: handle exception
            System.out.println("Integer String only");
        } finally {
            s.close();
        }
    }
    void arr(){
        try {
            String[] names = {"Apple", "Ball", "Cat", "Dog"};
            System.out.println(Arrays.toString(names));
            System.out.print("Enter a number: ");
            int choice = s.nextInt();
            System.out.println(names[choice]);
        } catch (ArrayIndexOutOfBoundsException ar) {
            // TODO: handle exception
            System.out.println("Out of Bounds");
            System.out.println("It should be 0-3");
        } finally {
            s.close();
        }
    }
}