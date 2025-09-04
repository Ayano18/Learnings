import java.util.*;
public class TODO {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> todo = new ArrayList<>();
        validation v = new validation(s, todo);
        while (true) {
        System.out.println("Welcome to TO-DO List");
        System.out.println("please choose the following: ");
        System.out.println("1. check");
        System.out.println("2. add");
        System.out.println("3. remove");
        System.out.println("4. exit");
        System.out.print(": ");
        int choice = s.nextInt();
        switch (choice) {
            case 1:
                System.out.println();
                v.check();
                System.out.println();
                break;
            case 2:
                System.out.println();
                v.add();
                System.out.println();
                break;
            case 3:
                System.out.println();
                v.remove();
                System.out.println();
                break;
            case 4:
                System.out.println();
                v.exit();
                System.out.println();
                break;
        
            default:
                break;
            }
        }
    }
}
class validation{
    Scanner s;
    ArrayList<String> todo;
    validation(Scanner s, ArrayList<String> todo) {
        this.s = s;
        this.todo = todo;
    }
    void start(){
        
    }
    void check(){
        if (todo.isEmpty()) {
            System.out.println("empty list");
        } else {
            System.out.println("Pending Task: ");
            System.out.println(todo);
        }
    }
    void add(){
        System.out.print("enter task you want to add: ");
        String add = s.next();
        todo.add(add);
        check();
    }
    void remove(){
        if (todo.isEmpty()) {
            System.out.println("empty list");
        } else {
            System.out.println("enter you want to remove");
            System.out.println(todo);
            System.out.print(": ");
            todo.remove(s.nextInt());
            check();
        }
        
    }
    void exit(){
        
    }
}