package Path;
import java.io.*;
import java.util.Scanner;

public class TaskPerf6 {
    private static final String FILE_PATH = "C:\\Users\\Timot\\OneDrive\\Documents\\Advance learning\\Path\\records.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to User Authentication System");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.print("Please select an option (1 or 2): ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                registerUser();
                break;
            case 2:
                loginUser();
                break;
            default:
                System.out.println("Invalid option. Please select 1 or 2.");
        }

        scanner.close();
    }

    private static void registerUser() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH, true))) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter username: ");
            String username = scanner.nextLine().trim();

            System.out.print("Enter password: ");
            String password = scanner.nextLine().trim();

            if (!username.matches("[a-zA-Z0-9]+") || !password.matches("[a-zA-Z0-9]+")) {
                System.out.println("Invalid characters. Only alphanumeric characters are allowed.");
                return;
            }

            writer.println(username + "," + password);
            System.out.println("User registered successfully.");

            scanner.close();
        } catch (IOException e) {
            System.out.println("Error registering user: " + e.getMessage());
        }
    }

    private static void loginUser() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter username: ");
            String username = scanner.nextLine().trim();

            System.out.print("Enter password: ");
            String password = scanner.nextLine().trim();

            String line;
            boolean loggedIn = false;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                    loggedIn = true;
                    break;
                }
            }

            if (loggedIn) {
                System.out.println("Successfully logged in.");
            } else {
                System.out.println("Incorrect username or password.");
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("Error logging in: " + e.getMessage());
        }
    }
}
