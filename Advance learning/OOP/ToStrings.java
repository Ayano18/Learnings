public class ToStrings{
    public static void main(String[] args){
        Passs Passs = new Passs();
        System.out.println(Passs);//print all
        System.out.println(Passs.toString());//print all but object
    }
}
class Passs{
    String name = "name";
    int age = 1;
    double d = 1.0;
    public String toString(){
        return name+" "+age+" "+d;
    }
}