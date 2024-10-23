/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Song;

/**
 *
 * @author Timot
 */
public class Song {
    
    public static void main(String[] agrs) {
        
        String[] lyrics = {
            
            "Girl, you got me hooked onto something",
            "Who could say that they saw us coming?",
            "Tell me",
            "Do you feel the love?",
        };
        
        int delay = 140;
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Hello");
        System.out.println("");
        Song(lyrics, delay);
    }
    
    private static void Song(String[] lyrics, int delay) {
        try {
            for (String line : lyrics) {
                
                System.out.println("\r");
                
                for (char c : line.toCharArray()) {
                    System.out.println(c);
                    Thread.sleep(delay);
                }
                
                Thread.sleep(delay = 10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}