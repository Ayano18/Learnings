package Stacks;
import java.util.*;
import java.util.Stack;
public class EmptyStack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int num;
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        
        if(!stack.isEmpty()){
            System.out.println(stack);
        } else {
            System.out.println("Empty");
        }
    }
}
