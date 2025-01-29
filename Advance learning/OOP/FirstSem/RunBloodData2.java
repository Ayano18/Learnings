import java.util.*;
public class RunBloodData2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BloodData2 dugo = new BloodData2();
        
        System.out.print("Enter blood type of patient: ");
        dugo.setBlood(s.nextLine());

        System.out.print("Enter the Rhesus factor (+ or -)");
        dugo.setFactor(s.nextLine());

        dugo.display();


        s.close();
    }
}
class BloodData2{
    private String bloodType;
    private String rhFactor;


    public String getBlood() {
        return bloodType;
    }
    public void setBlood(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getFactor() {
        return rhFactor;
    }
    public void setFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public BloodData2(){
        System.out.println("Enter blood type of patient: ");
        System.out.println("Enter the Rhesus factor (+ or -):");
        System.out.print("O+ is added to the blood bank. \n");
        System.out.println("\n");
    }

    private boolean isValidBloodType(String bt) {
        return bt.equalsIgnoreCase("O") || bt.equalsIgnoreCase("A") || bt.equalsIgnoreCase("B") || bt.equalsIgnoreCase("AB");
    }

    private boolean isValidRhFactor(String rh) {
        return rh.equalsIgnoreCase("+") || rh.equalsIgnoreCase("-");
    }

    public void display(){
        if(isValidBloodType(bloodType) && isValidRhFactor(rhFactor)){
            System.out.println(getBlood() + getFactor() + " is added to the blood bank.");
        } else {
            System.out.println("Invalid Input");
        }
        
    }
}