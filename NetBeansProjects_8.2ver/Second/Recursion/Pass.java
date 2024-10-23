/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Timot
 */
/*
public class Pass {
public static void main (String[] args) {
//example statements of how to use a non-static function
Pass msg = new Pass();
msg.displayMessage();
displayInfo("Jess", "Diaz", 19);
}
//a non-static function with empty parameters list
public void displayMessage () {
System.out.println("“This is an example void function that will display when invoked.”");
}
//a static function with parameters list
public static void displayInfo (String fname, String lname, int age) {
System.out.println("Student Information:");
System.out.println("Pass Name: " + fname);
System.out.println("Last Name: " + lname);
System.out.println("Age: "+ age);
}
}
*/
/*
    public class Pass {
        public static void main (String[] args) {
        int x = 3;
        passMethod(x); //invoke passMethod with x as argument
        System.out.println("After invoking passMethod, x = " + x);
        }
        //change parameter in passMethod()
        public static void passMethod (int x) {
        x = 10;
        System.out.println("The value of x inside the passMethod is " + x);
    }
}
*/
public class Pass{
    public static void main(String[] args){
        String name = "Tim";
        IGN(name);
        System.out.println("My real name "+name);
    }
    public static void IGN (String name){
        name = "FurElise";
        System.out.println("IGN name "+name);
    }
}