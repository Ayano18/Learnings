import java.util.Scanner;

public class RunQuad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose a shape to describe:");
        System.out.println("R - Rectangle");
        System.out.println("S - Square");
        System.out.println("P - Parallelogram");
        System.out.println("H - Rhombus");
        System.out.println("T - Trapezoid");

        char choice = s.next().toUpperCase().charAt(0);
        Quadrilateral shape;

        switch (choice) {
            case 'R':
            System.out.println("A Rectangle: ");
                shape = new Rectangle();
                break;
            case 'S':
            System.out.println("A Square: ");
                shape = new Square();
                break;
            case 'P':
            System.out.println("A Parallelogram: ");
                shape = new Parallelogram();
                break;
            case 'H':
            System.out.println("A Rhombus: ");
                shape = new Rhombus();
                break;
            case 'T':
            System.out.println("A Trapezoid: ");
                shape = new Trapezoid();
                break;
            default:
                System.out.println("Invalid choice. Please choose R, S, P, H, or T.");
                s.close();
                return;
        }

        shape.showDescription();
        s.close();
    }
}

class Quadrilateral {
    public void showDescription() {
        System.out.println("- is quadrilateral");
    }
}

class Rectangle extends Quadrilateral {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 right angles");
    }
}

class Square extends Rectangle {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 equal sides");
    }
}

class Parallelogram extends Quadrilateral {
    @Override
    public void showDescription() {
        System.out.println("- has 2 pairs of parallel sides");
    }
}

class Rhombus extends Parallelogram {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 congruent sides");
    }
}

class Trapezoid extends Quadrilateral {
    @Override
    public void showDescription() {
        System.out.println("- has 1 pair of parallel sides");
    }
}
