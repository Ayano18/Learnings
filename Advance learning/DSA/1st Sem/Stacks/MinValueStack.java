package Stacks;
import java.util.Stack;

public class MinValueStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(5);
        stack.push(20);
        stack.push(2);
        stack.push(15);

        int highestValue = findLowestValue(stack);
        System.out.println("Highest value in the stack: " + highestValue);
    }

    public static int findLowestValue(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return Integer.MAX_VALUE; // Handle empty stack case
        }

        int lowest = stack.peek(); // Initialize with the top element

        while (!stack.isEmpty()) {
            int current = stack.pop();
            lowest = Math.min(lowest, current);
        }

        return lowest;
    }
}