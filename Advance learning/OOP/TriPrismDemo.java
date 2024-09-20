import java.util.*;

// TriPrism.java
class TriPrism<T extends Number> {
    private T length;
    private T base;
    private T height;

    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getBase() {
        return base;
    }

    public void setBase(T base) {
        this.base = base;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public double calculateVolume() {
        return length.doubleValue() * 0.5 * base.doubleValue() * height.doubleValue();
    }
}

public class TriPrismDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        TriPrism<Integer> tp1 = new TriPrism<>();
        System.out.println("Enter dimensions for Triangular Prism 1 (Integer):");
        System.out.print("Length: ");
        tp1.setLength(s.nextInt());
        System.out.print("Base: ");
        tp1.setBase(s.nextInt());
        System.out.print("Height: ");
        tp1.setHeight(s.nextInt());

        
        System.out.println("\nTriangular Prism 1");
        System.out.println("Length: " + tp1.getLength());
        System.out.println("Base: " + tp1.getBase());
        System.out.println("Height: " + tp1.getHeight());
        System.out.println("The volume of the triangular prism is " + tp1.calculateVolume() + ".");

        
        TriPrism<Double> tp2 = new TriPrism<>();
        System.out.println("\nEnter dimensions for Triangular Prism 2 (Double):");
        System.out.print("Length: ");
        tp2.setLength(s.nextDouble());
        System.out.print("Base: ");
        tp2.setBase(s.nextDouble());
        System.out.print("Height: ");
        tp2.setHeight(s.nextDouble());

        
        System.out.println("\nTriangular Prism 2");
        System.out.println("Length: " + tp2.getLength());
        System.out.println("Base: " + tp2.getBase());
        System.out.println("Height: " + tp2.getHeight());
        System.out.println();
        System.out.println("The volume of the triangular prism is " + tp2.calculateVolume() + ".");
        
        s.close();
    }
}
