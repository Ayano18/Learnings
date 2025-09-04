package Stacks;
import java.util.*;
import java.util.Stack;
public class SearchStack{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<String> ack = new Stack<>();
        Stack<Integer> nums = new Stack<>();

        int find;
        String str = "Four";

        ack.push("One");
        ack.push("Two");
        ack.push("Three");
        ack.push("Four");
        ack.push("Five");
        System.out.println(ack);
        
        find = ack.search(str);
        System.out.println("find value: " + str);
        System.out.println("The stack value of "+ str + " is " + find);
        System.out.println("index of: "+ack.indexOf(str));


        System.out.println("\n");


        int digit = 4;

        nums.push(1);
        nums.push(2);
        nums.push(3);
        nums.push(4);
        nums.push(5);
        System.out.println(nums);

        find = nums.search(digit);
        System.out.println("find value: " + digit);
        System.out.println("The stack value of "+ digit + " is " + find);
        System.out.println("index of: "+nums.indexOf(digit));
    }

}