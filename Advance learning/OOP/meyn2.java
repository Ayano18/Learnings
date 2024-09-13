import java.util.*;

public class meyn2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int health = 100;
        int a, b, c;
        a = 20;
        b = 30;
        c = 50;

        while(true){
        System.out.println("Enter a letter to attack");
        String input = s.nextLine();
        if(input.equalsIgnoreCase("a")){
            System.out.println(health - a);
        } else if(input.equalsIgnoreCase("b")){
            System.out.println(health - b);
        } else if(input.equalsIgnoreCase("c")){
            System.out.println(health - c);
        } else {
            System.out.println("Invalid input");
        }
        }
        
    }
}
















/*
 * double dbl = 20.5;
        int num = (int) dbl;
        System.out.println(num);
 */