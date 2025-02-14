import java.util.*;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class BookStackQueue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Stack<String> bookStack = new Stack<>();
        Queue<String> bookQueue = new LinkedList<>();

        System.out.println("Enter four book titles.");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Book " + i + ": ");
            String book = s.nextLine();
            bookStack.push(book);
        }

        while (!bookStack.isEmpty()) {
            bookQueue.add(bookStack.pop());
        }

        System.out.println("\nNew order of books:");
        System.out.println(bookQueue);
    }
}
