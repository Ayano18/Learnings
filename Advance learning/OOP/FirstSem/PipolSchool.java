import java.util.*;

public class PipolSchool {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Press E for Employee, F for faculty, and S for student: ");
        String selection = s.nextLine();

        System.out.print("Enter name: ");
        String name = s.nextLine();

        System.out.print("Enter contact number: ");
        String contact = s.nextLine();

        if (selection.equalsIgnoreCase("E")) {
            System.out.print("Enter salary: ");
            double salary = s.nextDouble();
            s.nextLine(); 
            System.out.print("Enter department: ");
            String department = s.nextLine();
            System.out.println("\n---------------\n");
            Employee emp = new Employee(name, contact, department, salary);
            emp.pasapasa();

        } else if (selection.equalsIgnoreCase("F")) {
            System.out.print("Enter salary: ");
            double salary = s.nextDouble();
            s.nextLine(); 
            System.out.print("Enter department: ");
            String department = s.nextLine();
            System.out.print("Is faculty regular/tenured? (Y/N): ");
            boolean status = s.nextLine().equalsIgnoreCase("Y");
            System.out.println("\n---------------\n");
            Faculty f = new Faculty(name, contact, department, salary);
            f.setStatus(status);
            f.pasapasa();

        } else if (selection.equalsIgnoreCase("S")) {
            System.out.print("Enter Program: ");
            String program = s.nextLine();
            System.out.print("Enter Year Level: ");
            int yearlevel = s.nextInt();
            System.out.println("\n---------------\n");
            Students sti = new Students(name, contact, program, yearlevel);
            sti.pasapasa();

        } else {
            System.out.println("Invalid Input");
        }

        s.close();
    }
}

class Persons {
    private String name, contact;

    public Persons(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void pasapasa() {
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contact);
    }
}

class Students extends Persons {
    private String program;
    private int yearlevel;

    public Students(String name, String contact, String program, int yearlevel) {
        super(name, contact);
        this.program = program;
        this.yearlevel = yearlevel;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYearlevel() {
        return yearlevel;
    }

    public void setYearlevel(int yearlevel) {
        this.yearlevel = yearlevel;
    }

    @Override
    public void pasapasa() {
        super.pasapasa();
        System.out.println("Program: " + program);
        System.out.println("Year Level: " + yearlevel);
    }
}

class Employee extends Persons {
    private String department;
    private double salary;

    public Employee(String name, String contact, String department, double salary) {
        super(name, contact);
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void pasapasa() {
        super.pasapasa();
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Faculty extends Employee {
    private boolean status;

    public Faculty(String name, String contact, String department, double salary) {
        super(name, contact, department, salary);
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void pasapasa() {
        super.pasapasa();
        System.out.println("Status: " + (status ? "Regular" : "Not Regular"));
    }
}
