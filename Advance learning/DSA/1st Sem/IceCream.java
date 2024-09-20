import java.util.LinkedList;

public class IceCream {

    public static void main(String[] args) {
        LinkedList<String> IceCreamFlavors = new LinkedList<>();

        IceCreamFlavors.add("Vanilla");
        IceCreamFlavors.add("Chocolate");
        IceCreamFlavors.add("Strawberry");
        IceCreamFlavors.add("Rocky Road");

        System.out.println(IceCreamFlavors);
        System.out.println("Elements: " + IceCreamFlavors.size());
        /* 
        //for-each loops hihi :>
        System.out.println("Ice Cream Flavors Linked List:");
        for (String flavor : IceCreamFlavors) {
            System.out.println(flavor);
        }
        */

        //for loops hihi :>
        System.out.println("Ice Cream Flavors Linked List:");
        for (int i = 0; i < IceCreamFlavors.size(); i++) {
            System.out.println(IceCreamFlavors.get(i));
        }
    }
}
