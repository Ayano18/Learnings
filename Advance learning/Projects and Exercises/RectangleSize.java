import java.util.Scanner;

public class RectangleSize {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Rectangle rec = new Rectangle();

        System.out.print("Enter width for rectangle: ");
        double width = s.nextDouble();
        System.out.print("Enter height for rectangle: ");
        double height = s.nextDouble();

        System.out.println();
        System.out.println("The area of the rectangle is: "+ (rec.GetWitdh(width) * rec.GetHeight(height)));
        System.out.println("The perimeter of the rectangle is: " + (rec.GetWitdh(width) * rec.GetHeight(height)) / 2);
    }
}
class Rectangle{
    private double width;
    private double height;

    Scanner s = new Scanner(System.in);

    public double GetWitdh(double width){
        return width;
    }
    public double GetHeight(double height){
        return height;
    }
    public void SetWidth(double width){
        this.width = width;
    }
    public void SetHeight(double height){
        this.height = height;
    }
    void function(){
        
        System.out.println();
    }
}