package Stacks;
import java.util.Stack;

public class MaxValueStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(5);
        stack.push(20);
        stack.push(8);

        int highestValue = findHighestValue(stack);
        System.out.println("Highest value in the stack: " + highestValue);
    }

    public static int findHighestValue(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return Integer.MIN_VALUE; // Handle empty stack case
        }

        int highest = stack.peek(); // Initialize with the top element

        while (!stack.isEmpty()) {
            int current = stack.pop();
            highest = Math.max(highest, current);
        }

        return highest;
    }
}