import java.util.*;
import java.util.Stack;
public class FruitBasket {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Stack<String> basket = new Stack<>();
        /*
        basket.push("Apple");
        basket.push("Orange");
        basket.push("Mango");
        basket.push("Guava");
        */
            System.out.print("Enter number of fruits: ");
            int fruits = s.nextInt();
            System.out.println("Press A for apple, O for orange, M for mango, G for guava");
            for(int i = 0; i <= fruits; i++){
                
                String choice = s.nextLine();
                System.out.println("Fruit " + i + " of " + fruits);
                if(choice.equals("A") || choice.equals("a")){
                    basket.push("Apple");
                } else if(choice.equals("O") || choice.equals("o")){
                    basket.push("Orange");
                } else if(choice.equals("M") || choice.equals("m")){
                    basket.push("Mango");
                } else if(choice.equals("G") || choice.equals("g")){
                    basket.push("Guava");
                } else {
                    i--;
                }
            }
        
        System.out.println(basket);
        while(!basket.isEmpty()){
            System.out.println("Enter E to eat the fruits");
            char select = s.next().charAt(0);
            if(select == 'E' || select == 'e'){
                basket.pop();
                if(basket.isEmpty()){
                    System.out.println("No no fruits exist na");
                } else {
                    System.out.println("Remaining: " + basket);
                }
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}
/*

*/