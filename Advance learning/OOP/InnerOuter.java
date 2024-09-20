import java.util.*;

public class InnerOuter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        OuterClass out = new OuterClass();
        OuterClass.InnerClass in = out.new InnerClass();
        System.out.println(out.outside_personality + " " + in.inside_personality);

        System.out.println();
    }
}
class OuterClass{
    String outside_personality = "Angel";
class InnerClass{
    String inside_personality = "Devil";
}
}
