import java.util.*;
public class Circle{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Formula fm = new Formula(); 
        fm.function();
    }
}
class Formula{
    Scanner s = new Scanner(System.in);
    double pi = 3.1415926535898;
    double radius;
    double diameter;
    public double getDiameter(double radius, double diameter){
        return radius * 2;
    }
    public double getArea(double pi, double radius){
        return pi * (radius * radius);
    }
    public double getCircumference(double pi, double radius){
        return 2 * pi * radius;
    }
    void function(){
        System.out.print("Radius of the circle is: ");
        radius = s.nextDouble();
        System.out.println("Diameter: "+getDiameter(radius, diameter));
        System.out.println("The area of the circle is: "+getArea(pi, radius));
        System.out.println("The circumference of the circle is: "+getCircumference(pi, radius));
    }
}