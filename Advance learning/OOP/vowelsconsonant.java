import java.util.*;
public class vowelsconsonant{
    public static boolean hasVowels(String str) {
        // Convert the string to lowercase for case-insensitive check
        str = str.toLowerCase();
        
        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
          // Check if the character is a vowel (a, e, i, o, u)
          if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true; // If a vowel is found, return true
          }
        }
        
        // If no vowels are found, return false
        return false;
    }

      public static void main(String[] args){
        String str1 = "abcd";
        String str2 = "helloworld";
        
        System.out.println(hasVowels(str1)); // true (contains vowels)
        System.out.println(hasVowels(str2)); // true (contains vowels)
      }
}