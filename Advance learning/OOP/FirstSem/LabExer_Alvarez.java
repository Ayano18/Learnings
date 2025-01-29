import java.util.*;
public class LabExer_Alvarez{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first num: ");
        double one = s.nextInt();
        System.out.print("Enter second num: ");
        double two = s.nextInt();
        System.out.print("Enter third num: ");
        double three = s.nextInt();
        smallestnum(one, two, three);
        numavg(one, two, three);
    }
    public static void smallestnum(double one, double two, double three){
        System.out.println("smallest num: " + Math.min(Math.min(one, two), three));
    }
    public static void numavg(double one, double two, double three){
        double sum = one + two + three;
        double divisor = sum / 3;
        System.out.println("average: " + divisor);
    }
}