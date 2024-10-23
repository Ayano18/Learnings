package javaapplication1;
import java.util.*;
public class arrlist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Orange");
        color.add("White");
        color.add("Black");
        System.out.println(color);
        color.add(0, "Pink");
        System.out.println(color);
    }
}
