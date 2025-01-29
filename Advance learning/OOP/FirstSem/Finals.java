import java.util.*;
public class Finals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to McDonald's, Ma'am/Sir.");
        System.out.println("Please choose an option:");
        System.out.println("1. Dine-in");
        System.out.println("2. Drive-thru");
        int option = s.nextInt();
        if(option == 1){
            System.out.println("Kindly proceed to the counter to place your order, Ma'am/Sir.");
            System.out.println("Press any single character to order");
            char order = s.next().charAt(0);
            System.out.println("Good Day, Sir/Ma'am. What would you like to order from our menu?");
            String[] menu = {};
        } else {
            
        }
    }
}
class Order{
    
}