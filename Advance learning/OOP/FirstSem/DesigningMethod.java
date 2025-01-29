import java.util.*;
public class DesigningMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first num: ");
        double one = s.nextDouble();
        System.out.println("Enter second num: ");
        double two = s.nextDouble();
        System.out.println();
        plusFive(one, two);
        timesTwo(one, two);
        showSquared(one, two);
        computePercent(one, two);
        /* 
        System.out.println(plusFive(one, two));
        System.out.println(timesTwo(one, two));
        System.out.println(showSquared(one, two));
        System.out.println(one + " is " + computePercent(one, two) + "% of " + two);
        */

    }

    public static void plusFive(double one, double two){
        float five = 5;
        System.out.println((one + five) + " and " + (two + five));
    }
    public static void timesTwo(double one, double two){
        System.out.println(one * 2 + " and " + two * 2);
    }
    public static void showSquared(double one, double two){
        System.out.println(Math.pow(one, 2) + " and " + Math.pow(two, 2));
    }
    public static void computePercent(double one, double two){
        System.out.println(one + " is " + (one / two * 100) + "% of " + two);
    }
    /* 
    public static String plusFive(double one, double two){
        float five = 5;
        return (one + five) + " and " + (two + five);
    }
    public static String timesTwo(double one, double two){
        return one * 2 + " and " + two * 2;
    }
    public static String showSquared(double one, double two){
        return Math.pow(one, 2) + " and " + Math.pow(two, 2);
    }
    public static double computePercent(double one, double two){
        return one / two * 100;
    }
    */
}
