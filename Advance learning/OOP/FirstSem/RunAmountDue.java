import java.util.*;

class AmountDue {

    double computeAmountDue(double price) {
        return price + (price * 0.12);
    }

    double computeAmountDue(double price, int quantity) {
        double total = price * quantity;
        return total + (total * 0.12);
    }

    double computeAmountDue(double price, int quantity, double discount) {
        double total = price * quantity;
        total = total - discount;
        return total + (total * 0.12);
    }
}

public class RunAmountDue {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AmountDue due = new AmountDue();

        System.out.println("Press any of the following then enter values separated by spaces:");
        System.out.println("1 - price only");
        System.out.println("2 - price and quantity");
        System.out.println("3 - price, quantity, and discount amount");

        int choice = s.nextInt();

        double amountDue = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter price: ");
                double price1 = s.nextDouble();
                amountDue = due.computeAmountDue(price1);
                break;

            case 2:
                System.out.print("Enter price and quantity: ");
                double price2 = s.nextDouble();
                int quantity2 = s.nextInt();
                amountDue = due.computeAmountDue(price2, quantity2);
                break;

            case 3:
                System.out.print("Enter price, quantity, and discount amount: ");
                double price3 = s.nextDouble();
                int quantity3 = s.nextInt();
                double discount = s.nextDouble();
                amountDue = due.computeAmountDue(price3, quantity3, discount);
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        System.out.println("Amount due is " + amountDue);
        s.close();
    }
}
