import java.util.*;
public class LuckyNine{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        while (true) {

        System.out.println("Welcome to Lucky 9!" + "\n");
        int playercard1 = r.nextInt(10);
        int playercard2 = r.nextInt(10);
        int opponentcard1 = r.nextInt(10);
        int opponentcard2 = r.nextInt(10);
        
        int player = playercard1 + playercard2;
        int opponent = opponentcard1 + opponentcard2;

        System.out.println("You got: "+ player + "\n" + playercard1 + "\n" + playercard2 + "\n");

        System.out.println("Opponent got: "+ opponent + "\n" + opponentcard1 + "\n" + opponentcard2 + "\n");
        
        
        if(player > opponent){
            System.out.println("You win!");
        } else if(player < opponent){
            System.out.println("Opponent win!");
        } else {
            System.out.println("Tie!");
        }
        System.out.println("\n" + "Do you want to continue?" + "\n" + "Press Any character to continue" + " or " + "Press 0 to exit");
        String any = s.next();
        if(any.equalsIgnoreCase("0")){
            break;
        }
        }
        

    }
}