package Compro1;
/**
 *
 * @author Timothy
 */
import java.util.*;
public class TGLA_04_LAB_Exercise_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Employee name: ");//Jess Diaz
        String name = scanner.nextLine();
        System.out.println("Gross Pay: ");//25000.0
        double GrossPay = scanner.nextDouble();
        
        double WithholdingTax = 0.15 * GrossPay;//3750.0
        double sssContribution = 0.0363 * GrossPay;//907.5
        double MediCare = 0.0125 * GrossPay;//312.5
        double PagIbigContribution = 100.0;//100.0
        
        double NetPay = GrossPay - (WithholdingTax + sssContribution + MediCare + PagIbigContribution);
        
        System.out.println("");
        System.out.println("Employee name:         "+name);
        System.out.println("Gross Pay:             "+GrossPay);
        System.out.println("");
        System.out.println("________________________________");
        System.out.println("Deductions      " + "       Amount");
        System.out.println("With Holding Tax:      "+WithholdingTax);
        System.out.println("SSS Contribution:      "+sssContribution);
        System.out.println("Medicare:              "+MediCare);
        System.out.println("Pag-Ibig Contribution: "+PagIbigContribution);
        System.out.println("");
        System.out.println("________________________________");
        System.out.println("Net Pay:               "+ NetPay);
    }
}
