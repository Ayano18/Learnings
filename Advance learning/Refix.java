import java.util.*;
public class Refix{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Information info = new Information("Player", 0);
        Player1 p1 = new Player1("Player 1", 100);
        Player2 p2 = new Player2("Player 2", 100);
        while(p1.getHp() > 0 && 0 < p2.getHp()){
            p1.pl1(p2);
            p2.pl2(p1);


        }
        if (p1.getHp() <= 0){
            System.out.println("p1 wins");
        } else {
            System.out.println("p2 wins");
        }
        
    }
}
class Information{
    Scanner s = new Scanner(System.in);
    private String name;
    private int hp;
    int attack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    Information(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    public int att(){
        return hp -= attack;
    }
    public void pl1(Player2 b){
        System.out.println(getName()+" attacking!");
        System.out.println("Enter an amount to attack");
        attack = s.nextInt();
        System.out.println(b.getName()+": "+att());
    }
    public void pl2(Player1 a){
        System.out.println(getName()+" attacking!");
        System.out.println("Enter an amount to attack");
        attack = s.nextInt();
        System.out.println(a.getName()+": "+att()); 
    }
}
class Player1 extends Information{
    Scanner s = new Scanner(System.in);
    Player1(String name, int hp){
        super(name, hp);
    }
    public void pl1(Player2 b){
        super.pl1(b);
    }
}
class Player2 extends Player1{
    Scanner s = new Scanner(System.in);
    Player2(String name, int hp){
        super(name, hp);
    }
    public void pl2(Player1 a){
        super.pl2(a);
    }
}