package Compro2;
import java.util.*;

class Purchase {
    private String itemName;
    private int itemQuantity;
    private double itemPrice;
    private double amountDue;

    public void setItemName(String newItemName) {
        itemName = newItemName;
    }

    public void setTotalCost(int quantity, double price) {
        itemQuantity = quantity;
        itemPrice = price;
        amountDue = calculateTotalPrice();
    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalCost() {
        return amountDue;
    }

    public double calculateTotalPrice() {
        return itemQuantity * itemPrice;
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the item you are purchasing:");
        itemName = scanner.nextLine();

        System.out.println("Enter the quantity and price separated by a space:");
        itemQuantity = scanner.nextInt();
        itemPrice = scanner.nextDouble();

        amountDue = calculateTotalPrice();

        scanner.close();
    }

    public void writeOutput() {
        System.out.println("You are purchasing " + itemQuantity + " " + itemName + " at " + itemPrice + " each");
        System.out.println("Amount due is " + amountDue);
    }
}

public class LabExer2A {
    public static void main(String[] args) {
        Purchase purchase = new Purchase();
        purchase.readInput();
        purchase.writeOutput();
    }
}
