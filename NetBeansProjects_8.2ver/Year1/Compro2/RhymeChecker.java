package Compro2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timothy
 */

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RhymeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine().toLowerCase();

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine().toLowerCase();

        String sub = word1.substring(word1.length() - 2);

        
        Pattern pattern = Pattern.compile("[a-zA-Z]{1,2}" + sub + "\\b");

        
        Matcher matcher = pattern.matcher(word2);

        if (matcher.matches()) {
            System.out.println(word2 + " rhymes with " + word1);
        } else {
            System.out.println(word2 + " does not rhyme with " + word1);
        }

        scanner.close();
    }
}
