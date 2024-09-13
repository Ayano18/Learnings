import java.util.*;

public class Enumeration{
    public enum Semester{
        PRELIM, MIDTERM, PREFINALS, FINALS;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        Semester sem;
        int position;
        int comparison;

        System.out.println("grades: ");
        for(Semester sems : Semester.values()){
            System.out.print(sems+"  "); 
        }
        System.out.println();
        System.out.print("Enter enum: ");
        String input = s.nextLine().toUpperCase();

        sem = Semester.valueOf(input);

        System.out.println("u entered "+ sem);
        position = sem.ordinal();
        System.out.println(sem + " is in " + position);
        System.out.println("period number is "+ (position + 1));

        sem = Semester.MIDTERM;

        switch (sem) {
            case PRELIM:
                System.out.println("20%");
                break;
            case MIDTERM:
                System.out.println("20%");
                break;
            case PREFINALS:
                System.out.println("20%");
                break;
            case FINALS:
                System.out.println("40%");
                break;
        
            default:
                break;
        }


        Days day = new Days();
    }
}
class Days{
    Scanner sc = new Scanner(System.in);
    public enum Weeks{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
    Days(){

        try{
            System.out.println("Enter day: ");
            String input = sc.nextLine().toUpperCase();
            
            Weeks today = Weeks.valueOf(input);
    
            switch (today) {
                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                case FRIDAY:
                    System.out.println("Weekdays");
                    break;
            
                case SATURDAY:
                case SUNDAY:
                System.out.println("Weekends");
                break;
                default:
                    break;
            }
        } catch(IllegalArgumentException e){
            System.out.println("wrong");
        }
    }

}