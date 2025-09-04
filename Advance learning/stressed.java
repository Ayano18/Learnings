import java.util.*;


public class stressed {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] testing = new String[2];
        Double[] one = new Double[4];
        Double[] two = new Double[4];
        double a = 0;
        double b = 0;
        for(int i = 0; i < one.length; i++){
            System.out.println("Enter a num");
            one[i] = s.nextDouble();
            a += one[(int) i];
            scan(s, testing);
        }
         
        for(int i = 0; i < two.length; i++){
            two[i] = s.nextDouble();
            b += two[(int) i];
        }
        ArrayList<Double> grading = new ArrayList<>();

        for (double num : one) {
            grading.add(num);
        }
        for (double num : two) {
            grading.add(num);
        }


        System.out.println(grading);
        System.out.println("First = " + Arrays.toString(one));
        System.out.println("Second = " + Arrays.toString(two));
        System.out.println("The sum of First: " + a);
        System.out.println("The sum of First: " + b);
        System.out.println(Arrays.toString(testing));
    }
    static void scan(Scanner s, String str[]){
        for(int i = 0; i < str.length; i++){
            System.out.println("Enter a str");
            str[i] = s.next();
        }
    }
}
