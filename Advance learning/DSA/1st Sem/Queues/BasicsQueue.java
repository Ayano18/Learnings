package Queues;
import java.util.*;
public class BasicsQueue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<String> q = new LinkedList<>();
        Queue<Integer> qq = new LinkedList<>();
        
        q.offer("one");
        q.offer("two");
        q.offer("three");
        q.offer("four");
        System.out.println("The peek of queue elements is: "+ q.peek());
        System.out.println(q);
        System.out.println(q.size());
        System.out.println();
        q.poll();
        q.poll();
        System.out.println(q);
    }
}
