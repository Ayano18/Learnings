import java.util.*;
public class LearnAbstract{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        School sc1 = new NIS();
        School sc2 = new STI();

        sc1.location();
        sc2.location();
    }
}

abstract class School{
    abstract void location();
    String locate = "Aklan";
    void ads(String address){
        System.out.print(address+" ");
    }
}

class NIS extends School{
    void location(){
        super.ads("Numancia");
        System.out.println(locate);
    }
}
class STI extends NIS{
    void location(){
        super.ads("Capitol");
        System.out.println(locate);
    }
}