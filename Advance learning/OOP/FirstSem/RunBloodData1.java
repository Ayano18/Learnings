import java.util.*;

public class RunBloodData1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BloodData bd;
        System.out.print("Enter blood type (O, A, B, AB): ");
        String bloodType = s.nextLine();
        System.out.print("Enter Rh factor (+ or -): ");
        String rhFactor = s.nextLine();

        
        if (!bloodType.isEmpty() || !rhFactor.isEmpty()) {
            bd = new BloodData(bloodType, rhFactor);
            
        } else {
            bd = new BloodData();
        }
        
        bd.display();
        s.close();
    }
}

class BloodData {
    static String bloodType;
    static String rhFactor;

    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    public BloodData(String bt, String rh) {
        if (isValidBloodType(bt) && isValidRhFactor(rh)) {
            bloodType = bt;
            rhFactor = rh;
        } else {
            bloodType = "O";
            rhFactor = "+";
        }
    }

    public void display() {
        System.out.println("Blood Type: " + bloodType);
        System.out.println("Rh Factor: " + rhFactor);
        System.out.println(bloodType + rhFactor + " is added to the blood bank");
    }

    //sir nag add ako boolean validation
    private boolean isValidBloodType(String bt) {
        return bt.equalsIgnoreCase("O") || bt.equalsIgnoreCase("A") || bt.equalsIgnoreCase("B") || bt.equalsIgnoreCase("AB");
    }

    private boolean isValidRhFactor(String rh) {
        return rh.equalsIgnoreCase("+") || rh.equalsIgnoreCase("-");
    }

}
