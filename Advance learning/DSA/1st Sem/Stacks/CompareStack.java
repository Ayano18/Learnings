package Stacks;
import java.util.*;
import java.util.Stack;
public class CompareStack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<String> str1 = new Stack<>();
        Stack<String> str2 = new Stack<>();

        str1.push("one");
        str1.push("two");
        str1.push("three");
        System.out.println(str1);

        System.out.println("\n");

        str2.push("one");
        str2.push("two");
        str2.push("three");
        System.out.println(str2);

        if(str1.equals(str2)){
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

    }
}
