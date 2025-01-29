import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentLists {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> students = new HashMap<>();

        System.out.println("Enter details for 3 classmates");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter student number for classmate " + i + ": ");
            String studentNumber = scanner.nextLine();

            System.out.print("Enter first name for classmate " + i + ": ");
            String firstName = scanner.nextLine();

            students.put(studentNumber, firstName);
        }

        System.out.println("\nStudent List:");
        for (Map.Entry<String, String> entry : students.entrySet()) {
            System.out.println("Student Number: " + entry.getKey() + ", First Name: " + entry.getValue());
        }

        String thirdKey = (String) students.keySet().toArray()[2];
        students.remove(thirdKey);
        System.out.println("\nRemoved the third entry.");

        System.out.print("Enter your student number: ");
        String userStudentNumber = scanner.nextLine();

        System.out.print("Enter your first name: ");
        String userFirstName = scanner.nextLine();

        students.put(userStudentNumber, userFirstName);

        System.out.println("\nFinal Student List:");
        for (Map.Entry<String, String> entry : students.entrySet()) {
            System.out.println("Student Number: " + entry.getKey() + ", First Name: " + entry.getValue());
        }

        scanner.close();
    }
}
