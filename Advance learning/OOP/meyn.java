import java.util.*;
public class meyn{
    public static void main(String[] args){
        UmlDiagram uml = new UmlDiagram();
        
        uml.readinput();
        uml.writeOutput();
    }
}
class UmlDiagram{
    String itemName;
    double itemPrice;
    int itemQuantity;
    double amountDue;
    
    String getItemName;
    double getTotalCost;
    public void setItemName(String newItemName){
        
        itemName = newItemName;
        
    } 

    public void setTotalCost(int quantity, double price){
        
        itemQuantity = quantity;
        itemPrice = price;

    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalCost() {
        return amountDue;
    }

    public void readinput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the item you are purchasing");
        itemName = s.nextLine();

        System.out.println("Enter the quantity and price separated by a space");
        itemQuantity = s.nextInt();
        itemPrice = s.nextDouble();

        amountDue = itemQuantity*itemPrice;
        
    }

    public void writeOutput(){
        System.out.println("You are purchasing "+itemQuantity+ " " +itemName+"(s) "+"at "+itemPrice+" each");
        System.out.println("Amount Due is "+amountDue);
        
    }
}