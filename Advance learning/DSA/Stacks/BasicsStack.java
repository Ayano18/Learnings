package Stacks;
import java.util.*;
import java.util.Stack;
public class BasicsStack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Integer> stck = new Stack<>();
        stck.push(1);
        stck.push(2);
        stck.push(3);
        stck.push(4);
        stck.push(5);
        
        //System.out.println(stck.isEmpty()); //boolean true or false
        System.out.println(stck.peek());
        System.out.println(stck.pop()); //pop of last stack (LIFO)
        System.out.println(stck.peek()); //peek of last stack (LIFO)
        //stck.display(); //display the stack element
        //System.out.println(stck.set(0, 5));
        System.out.println(stck.size());
        System.out.println(stck);
        
    }
}
