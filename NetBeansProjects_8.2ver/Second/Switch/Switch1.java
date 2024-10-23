/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

/**
 *
 * @author Timot
 */
public class Switch1 {
    public static void main(String[] args) {
        int dayOfWeek = 3; // Change this to test different cases

        switch (dayOfWeek) {
            case 1:
                System.out.println("It's Monday!");
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("It's Tuesday!");
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("It's Wednesday!");
                System.out.println("Miyerkules");
                break;
            case 4:
                System.out.println("It's Thursday!");
                System.out.println("Huwebes");
                break;
            case 5:
                System.out.println("It's Friday!");
                System.out.println("Biyernes");
                break;
            case 6:
                System.out.println("It's Saturday!");
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("It's Sunday!");
                System.out.println("Linggo");
                break;
            default:
                System.out.println("Invalid day of the week!");
        }
    }
}
//with break it will cut off the execute and print the one case only
//without a break it will execute from case up to case down
//single case is only single constant
//CONDITION>STATEMENT>BREAK
