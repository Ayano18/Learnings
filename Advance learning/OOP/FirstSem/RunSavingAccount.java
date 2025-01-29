import java.util.*;

public class RunSavingAccount {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();
        System.out.println();

        
        do {
            try {
                System.out.print("Enter interest rate: ");
                savings.setInterestRate(s.nextDouble());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                s.next();
            }
        } while (true);

        do {
            try {
                System.out.print("Enter amount to deposit: ");
                savings.deposit(s.nextDouble());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                s.next();
            }
        } while (true);

        savings.showBalance(savings);
        
        do {
            
            System.out.print("Press D for another deposit or W to withdraw: ");
            char choice = s.next().charAt(0);

            
            
            if (Character.toUpperCase(choice) == 'D') {
                System.out.print("Enter amount to deposit: ");
                savings.deposit(s.nextDouble());
                if (savings.getBalance() > 1000) {
                    savings.addInterest();
                    System.out.println("Interest applied.");
                }
                SavingsAccount.showBalance(savings);
                break;
            }
            if (Character.toUpperCase(choice) == 'W') {
                System.out.print("Enter amount to withdraw: ");
                savings.withdraw(s.nextDouble());
                SavingsAccount.showBalance(savings);
                break;
            }

            
            
            
        } while (true);

    }
    
}

class SavingsAccount{
    
    Scanner s = new Scanner(System.in);
    private double balance;
    static double interestRate = 0;

    public SavingsAccount(){
        this.balance = 0;
    }
    public static void setInterestRate(double newRate){
        interestRate = newRate;
    }

    public static double getInterest(){
        return interestRate;
    }

    public double getBalance(){
        return balance;
    }
    
    public void deposit(double amount){
        balance += amount;  
    }
    
    
    public double withdraw(double amount){
        if(balance >= amount || balance == amount){
            balance -= amount;
        } else {
            balance -= amount;
        }
        return balance;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }

    public static void showBalance(SavingsAccount account){
        System.out.println("Your balance is: "+account.getBalance());
    }
}