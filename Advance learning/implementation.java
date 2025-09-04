import java.util.*;
public class implementation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("how many subjects do you have: ");
        int subs = s.nextInt();
        String[] subjects = new String[subs];
        Double[] grades = new Double[4];

        double q = 0;
        
        for(int i = 0; i < subjects.length; i++){
            System.out.println("Enter your subject/s");
            subjects[i] = s.next();
            for(int j = 0; j < grades.length; j++){
                System.out.println("Enter your grade/s");
                grades[j] = s.nextDouble();
                q += grades[(int) j];
            }
        }
        System.out.println(q);
        System.out.println(Arrays.toString(subjects));
        System.out.println(Arrays.toString(grades));
    }
}
