package Recursion;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExpression{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String a = "haha";
        String b = "123";
        String mix = "abc123";
        System.out.println("is " + a + " a alphabet letter? ");
        System.out.println(isLowerCaseAlphabet(a));
        System.out.println("is " + b + " a alphabet letter? ");
        System.out.println(isLowerCaseAlphabet(b));
        System.out.println();
        if(isLowerCaseAlphabet(a)){
            System.out.println(a);
        } else {
            System.out.println("invalid input");
        }
        if (isAlphaNumeric(mix)) {
            System.out.println("alphanumeric: " + mix);
        } else {
            System.out.println("it should be alphanumeric");
        }

    }
    static boolean isLowerCaseAlphabet(String str) {
        String regex = "^[a-z]+$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
    static boolean isUpperCaseAlphabet(String str){
        String regex = "^[A-Z]+$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
    static boolean isAlphaNumeric(String str){
        String regex = "^[a-zA-Z0-9]+$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}