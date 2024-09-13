import java.util.*;
public class Employ{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Employee emp1 = new Employee("Ichinose Honami", "Team Manager", 50000);
        Employee emp2 = new Employee("Kei Karuizawa", "Coach", 40000);
        emp1.Increase();
    }
}
class Employee{
    Scanner s = new Scanner(System.in);
    private String name, job;
    private int salary;
    public String getname(String name){
        return name;
    }
    public String getjob(String job){
        return job;
    }
    public int getsalary(int salary){
        return salary;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setjob(String job){
        this.job = job;
    }
    public void setsalary(int salary){
        this.salary = salary;
    }
    Employee(String name, String job, int salary){
        this.name = name;
        this.job = job;
        this.salary = salary;
        System.out.println();
        System.out.println("Employee Details: ");
        System.out.println("Name: "+ name);
        System.out.println("Job Title: "+ job);
        System.out.println("Salary: "+ salary);
    }
    public void Increase(){
        System.out.println();
        System.out.println("After raising salary: ");
        double raise = s.nextDouble();
        System.out.println(raise + "% for " + "'"+name+"'");
        System.out.println("Name: "+ name);
        System.out.println("Job Title: "+ job);
        raise /= 100;
        System.out.println("Salary: "+ (salary + (salary * raise)));
    }
}