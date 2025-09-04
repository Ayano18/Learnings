import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Numbers num = new Numbers();
        
        System.out.println("Welcome to Calculator!");
        System.out.println("Enter a number");
        num.setNum1(s.nextInt());
        System.out.println("Enter a number");
        num.setNum2(s.nextInt());

        System.out.println("Enter operator");
        char operator = s.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Addition");
                num.Addition();
            break;
            case '-':
                System.out.println("Subtraction");
                num.Subtraction();
            break;
            case '*':
                System.out.println("Multiplication");
                num.Multiply();
            break;
            case '/':
                System.out.println("Division");
                num.Division();
            break;
            default:
                break;
        }
    }
}
class Numbers{
    Scanner s;
    private int num1;
    private int num2;
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    void Addition(){
        System.out.println(getNum1() + " + " + getNum2() + " = " + (getNum1()+getNum2()));
    }
    void Subtraction(){
        System.out.println(getNum1() + " - " + getNum2() + " = " + (getNum1() - getNum2()));
    }
    void Multiply(){
        System.out.println(getNum1() + " * " + getNum2() + " = " + (getNum1() * getNum2()));
    }
    void Division(){
        System.out.println(getNum1() + " / " + getNum2() + " = " + (getNum1() / getNum2()));
    }
}