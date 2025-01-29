import java.util.PriorityQueue;
import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {
        PriorityQueue<String> nicknames = new PriorityQueue<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the nicknames of four classmates:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nickname " + (i + 1) + ": ");
            String nickname = s.nextLine();
            nicknames.add(nickname);
        }

        System.out.println("\nPress H to say 'Hi' to each classmate.");

        while (!nicknames.isEmpty()) {
            System.out.print("Enter your choice: ");
            String choice = s.nextLine();

            if (choice.equalsIgnoreCase("H")) {
                String name = nicknames.poll();
                if (!name.isEmpty()) {
                    System.out.println("Hi " + name + "!");
                }
            } else {
                System.out.println("Invalid input. Please press H.");
            }
        }

        System.out.println("Done saying Hi!");
    }
}
