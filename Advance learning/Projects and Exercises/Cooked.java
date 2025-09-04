import java.util.*;
public class Cooked{
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HouseHold hh = new HouseHold(s);
        while (true) {
            System.out.println();
            System.out.println("Welcome to House");
            System.out.println("1. Add Member");
            System.out.println("2. Delete Member");
            System.out.println("3. View Member");
            System.out.println("4. Update Member");
            System.out.print("choose: ");
            int choice = s.nextInt();
            if (choice == 1) {
                System.out.println();
                System.out.println("Enter the following questions");
                System.out.print("Enter name: ");
                String name = s.next();
                System.out.print("Enter age: ");
                int age = s.nextInt();
                System.out.print("Enter height: ");
                double height = s.nextDouble();
                hh.add(new Credentials(name, age, height));
            } else if(choice == 2){
                System.out.println();
                System.out.println("[DELETE]");
                hh.del();
            } else if(choice == 3){
                System.out.println();
                System.out.println("[VIEW]");
                hh.view();
            } else if(choice == 4){
                System.out.println();
                System.out.println("[UPDATE]");
                hh.update();
            } else {
                System.out.println("END!");
                break;
            }
        }
    }
}
class HouseHold{
    public ArrayList<Credentials> info = new ArrayList<>();
    Scanner s;

    public HouseHold(Scanner s){
        this.s = s;
    }

    public void add(Credentials credits){
        info.add(credits);
        System.out.println("added");
    }
    public void del() {
        if(info.isEmpty()){
            for (Credentials c : info){
                System.out.println(c.details());
            }
            System.out.println("no laman");
        } else {
        System.out.print("Enter name: ");
        String name = s.next();
        for (Credentials c : info) {
            if (c.getName().equalsIgnoreCase(name)) {
                info.remove(c);
                System.out.println(name + " removed successfully.");
                return;
            }
            System.out.println("Name not found.");
            }
        }
        
    }
    public void update() {
        if(info.isEmpty()){
            for (Credentials c : info){
                System.out.println(c.details());
            }
            System.out.println("no laman");
        } else {
            System.out.print("Enter name to update: ");
                String name = s.next();
                System.out.print("Enter new age: ");
                int age = s.nextInt();
                System.out.print("Enter new height: ");
                double height = s.nextDouble();
        for (Credentials c : info) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.setName(name);
                c.setAge(age);
                c.setHeight(height);
                System.out.println(name + " updated successfully.");
                return;
            }
        }
        System.out.println("Name not found.");
        }
        
    }
    public void view(){
        if(!info.isEmpty()){
            for(Credentials c : info){
                System.out.println(c.details());
            }
        } else {
            System.out.println("no laman");
        }
    }
}
class Credentials{
    private String name;
    private int age;
    private double height;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public Credentials(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public String details(){
        return ("\nCredentials \n" + "Name: "+ getName() + "\nAge: "+ getAge() + "\nDouble: "+ getHeight());
    }
}