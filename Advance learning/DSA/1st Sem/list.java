import java.util.LinkedList;
import java.util.*;
public class list{
    public static void main(String[] args){
        LinkedList<String> lists = new LinkedList<>();

        lists.add("Apple");
        lists.add("Ball");
        lists.add("Cat");
        lists.add("Dog");
        lists.remove(3);
        lists.addFirst("haha");
        lists.addLast("My Dog is dead");
        lists.remove("haha");
        lists.remove(2);
        lists.add(2, "MingMing");
        lists.removeFirst();
        lists.addFirst("Apple is disappear");
        System.out.println(lists);
    }
}