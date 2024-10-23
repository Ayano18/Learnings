package Compro1;

/**
 *
 * @author Timothy
 */
import java.util.Scanner;
public class TGLA_09_TaskPerformance_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three first names: ");
        System.out.print(": "); String name1 = scanner.nextLine();//Mark
        System.out.print(": "); String name2 = scanner.nextLine();//Ryan
        System.out.print(": "); String name3 = scanner.nextLine();//John
        
        String first = name1.concat(" "+name2);
        String second = name1.concat(" "+name3);
        String third = name2.concat(" "+ name1);
        String fourth = name2.concat(" "+ name3);
        String fifth = name3.concat(" "+ name1);
        String sixth = name3.concat(" "+ name2);
        
        System.out.println();
        System.out.println("Possible names are: ");
        System.out.println();
        System.out.println("1 - " + first);
        System.out.println("2 - " + second);
        System.out.println("3 - " + third);
        System.out.println("4 - " + fourth);
        System.out.println("5 - " + fifth);
        System.out.println("6 - " + sixth);
        System.out.println();
        System.out.print("Enter 1-6 to select a name: ");
        int select = scanner.nextInt();
        switch (select){
            case 1:
                System.out.println("The initials for "+first+" is "+name1.charAt(0)+name2.charAt(0)+".");
                System.out.println();
                System.out.println("Suggested username: "+first.toLowerCase().replace(" ", "_"));
                break;
            case 2:
                System.out.println("The initials for "+second+" is "+name1.charAt(0)+name3.charAt(0)+".");
                System.out.println();
                System.out.println("Suggested username: "+second.toLowerCase().replace(" ", "_"));
                break;
            case 3:
                System.out.println("The initials for "+third+" is "+name2.charAt(0)+name1.charAt(0)+".");
                System.out.println();
                System.out.println("Suggested username: "+third.toLowerCase().replace(" ", "_"));
                break;
            case 4:
                System.out.println("The initials for "+fourth+" is "+name2.charAt(0)+name3.charAt(0)+".");
                System.out.println();
                System.out.println("Suggested username: "+fourth.toLowerCase().replace(" ", "_"));
                break;
            case 5:
                System.out.println("The initials for "+fifth+" is "+name3.charAt(0)+name1.charAt(0)+".");
                System.out.println();
                System.out.println("Suggested username: "+fifth.toLowerCase().replace(" ", "_"));
                break;
            case 6:
                System.out.println("The initials for "+sixth+" is "+name3.charAt(0)+name2.charAt(0)+".");
                System.out.println();
                System.out.println("Suggested username: "+sixth.toLowerCase().replace(" ", "_"));
                break;
            default:
                System.out.println("error");
        }
    }
}
//2 hrs coding dahil sa logical error
