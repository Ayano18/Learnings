import java.util.*;
public class Friendstatic {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Friends f1 = new Friends("Spongebob");
        Friends f2 = new Friends("Patrick");
        Friends f3 = new Friends("Squidward");
        System.out.println(Friends.count);
        Friends.frcount();


    }
}
class Friends{
    String name;
    static int count;
    Friends(String name){
        this.name = name;
        count++;
    }
    static void frcount(){
        System.out.println("Number of friends: "+count);
    }
}