import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class MovieTime {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Queue<String> movies = new LinkedList<>();
        Queue<String> snacks = new LinkedList<>();
        String movie;
        String snack;
        while(true){
            
        for(int i = 1; i <= 3; i++){
            System.out.println("Enter 3 movie he/she wants to watch: movies " + i + " of 3");
            movie = s.nextLine();
            //System.out.println(movie);
            movies.offer(movie);
        }
        for(int i = 1; i <= 3; i++){
            System.out.println("Enter snack " + i + " of 3");
            snack = s.nextLine();
            //System.out.println(snack);
            snacks.offer(snack);
        }
        break;
        }
        
        System.out.println();
        System.out.println("Movies to watch are: " + movies);
        System.out.println("Snacks available are: " + snacks);
        System.out.println();
        
        while(!snacks.isEmpty()){
            System.out.println("Press S to each time you finish a snack ");
            char select = s.next().charAt(0);
            if(select == 'S' || select == 's'){
                snacks.poll();
                if(snacks.isEmpty()){
                    System.out.println("No no snacks exist na");
                } else {
                    System.out.println("Remaining: " + snacks);
                }
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}