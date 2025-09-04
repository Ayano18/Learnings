import java.util.*;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

interface Ordering {
    void orderItem(int itemIndex);
    double getTotalPrice();
    void printOrderSummary();
}

class DineIn implements Ordering {
    public List<MenuItem> orderedItems = new ArrayList<>();

    @Override
    public void orderItem(int itemIndex) {
        MenuItem item = Menu.menu[itemIndex];
        orderedItems.add(item);
        System.out.println("Dine-In: Ordered " + item.getName());
    }

    @Override
    public double getTotalPrice() {
        double total = 0;
        for (MenuItem item : orderedItems) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public void printOrderSummary() {
        System.out.println("Dine-In Order Summary:");
        for (MenuItem item : orderedItems) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total Price: $" + getTotalPrice());
    }
}

class DriveThru implements Ordering {
    public List<MenuItem> orderedItems = new ArrayList<>();

    @Override
    public void orderItem(int itemIndex) {
        MenuItem item = Menu.menu[itemIndex];
        orderedItems.add(item);
        System.out.println("Drive-Thru: Ordered " + item.getName());
    }

    @Override
    public double getTotalPrice() {
        double total = 0;
        for (MenuItem item : orderedItems) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public void printOrderSummary() {
        System.out.println("Drive-Thru Order Summary:");
        for (MenuItem item : orderedItems) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total Price: $" + getTotalPrice());
    }
}

class Menu {
    public static MenuItem[] menu = {
        new MenuItem("Burger", 5.99),
        new MenuItem("Fries", 2.99),
        new MenuItem("Soda", 1.99),
        new MenuItem("Salad", 4.99),
        new MenuItem("Mc-nuggets", 2.99),
        new MenuItem("Ice Coffee", 4.99),
        new MenuItem("Ice Cream", 4.99),
        new MenuItem("Water", 1.00)
    };
}

public class FastFoodChain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Fast Food Chain!");
        System.out.println("Please choose an option:");
        System.out.println("1. Dine-in");
        System.out.println("2. Drive-thru");
        System.out.print(":");
        int choice = s.nextInt();
        Ordering ordering = (choice == 1) ? new DineIn() : new DriveThru();
        String orderType = (choice == 1) ? "Dine-In" : "Drive-Thru";
        System.out.println("You have chosen " + orderType + ". Enjoy your meal!");

        System.out.println("Menu:");
        for (int i = 0; i < Menu.menu.length; i++) {
            System.out.println((i + 1) + ": " + Menu.menu[i].getName() + " - $" + Menu.menu[i].getPrice());
        }

        System.out.println("Enter the item number to order (or 0 to finish):");
        while (true) {
            int itemIndex = s.nextInt();
            if (itemIndex == 0) {
                break;
            }
            if (itemIndex >= 1 && itemIndex <= Menu.menu.length) {
                ordering.orderItem(itemIndex - 1);
            } else {
                System.out.println("Invalid item number. Please try again.");
            }
        }

        // Confirming the order
        System.out.println("Do you want to confirm your order? (yes/no)");
        String confirm = s.next();
        if (confirm.equalsIgnoreCase("yes")) {
            ordering.printOrderSummary();
        } else {
            System.out.println("Order has been canceled.");
        }

        s.close();
    }
}