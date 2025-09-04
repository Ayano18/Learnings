import java.util.*;
public class STIGradingSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        STIKalibo capitol = new STIKalibo(s);
        capitol.sample();
        System.out.println("Welcome to Grading System Calculator");
        System.out.println("Mind if you answer the following questions?");
        System.out.print("Enter your name: ");
        String name = s.next();
        System.out.println("What is your status?");
        System.out.println("1. SHS");
        System.out.println("2. College");
        int choice = s.nextInt();
        if (choice == 1) {
            System.out.println("SHS");
            System.out.print("Year: ");
            int year = s.nextInt();
            System.out.print("Strand: ");
            String strand = s.next();
            System.out.println("Hello "+ name);
        } else {
            System.out.println("College");
            System.out.print("Year: ");
            int year = s.nextInt();
            System.out.print("Course: ");
            String course = s.next();
        }
    }
}
class STIKalibo{
    ArrayList<Details> graded = new ArrayList<>();
    Scanner s;
    public STIKalibo(Scanner s){
        this.s = s;
    }
    public void ONESHS(Details details){
        System.out.println();
    }
    public void TWOSHS(){
        
    }
    public void sample(){
        int arrs[] = {85, 90, 92, 80};
        double arr[] = {17.45, 17.60, 19.10, 30.50};
        double sum = 0.0;
        for(double i = 0; i < arr.length; i++){
            sum += arr[(int) i];
            
        }
        System.out.println(sum);
    }
}
class Details{
    private String subject;
    private double grade[];


    public double[] getGrade() {
        return grade;
    }
    public void setGrade(double[] grade) {
        this.grade = grade;
    }
    
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public String result(){
        return getSubject() + "\n" + Arrays.toString(getGrade());
    }
}