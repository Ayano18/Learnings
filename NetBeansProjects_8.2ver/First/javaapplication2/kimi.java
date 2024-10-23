import javax.swing.JOptionPane;
import java.util.*;

public class kimi {
    public static void main(String[] args) {
        
        //String name = JOptionPane.showInputDialog("What is your name?");
        //JOptionPane.showMessageDialog(null, "Hello " + name);
        Scanner s = new Scanner(System.in);
        High h = new High();
        System.out.println();
        Low l = new Low();

        
    }
}
class High{
    
    High(){
    int[] array = {1, 9, 2, 7, 10, 0, 5, 11};
    int n = array.length;
    for(int i = 0; i < array.length; i++){
        System.out.print(array[i]+" ");
    }
    System.out.println();
    findHigh(array, n);
    }
    void findHigh(int[]array, int n){
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(array[i] > first){
                third = second;
                second = first;
                first = array[i];
            } else if (array[i] > second && array[i] != first) {
                third = array[i];
            }
        }
        System.out.println("Largest: "+first+" "+second+" "+third);
    }
}
class Low{
    
    Low(){
    int[] array = {1, 9, 2, 7, 10, 0, 5, 11};
    int n = array.length;
    for(int i = 0; i < array.length; i++){
        System.out.print(array[i]+" ");
    }
    System.out.println();
    findLow(array, n);
    }
    void findLow(int[]array, int n){
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE, third = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(array[i] < first){
                third = second;
                second = first;
                first = array[i];
            } else if (array[i] < second && array[i] != first) {
                third = array[i];
            }
        }
        System.out.println("Lowest: "+first+" "+second+" "+third);
    }
}