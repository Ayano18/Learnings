/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timot
 */
public class Lyrics {
    public static void main(String[] args){
        String[] songLyrics = {
            "In the midst of the crowds",
            "In the shapes in the clouds",
            "I don't see nobody but you",
            "In my rose-tinted dreams",
            "Wrinkled silk on my sheets",
            "I don't see nobody but you",
            "Girl, you got me hooked onto something",
            "Who could say that they saw us coming?",
            "Tell me",
            "Do you feel the love?",
            "Spend a summer or a lifetime with me",
            "Let me take you to the place of your dreams",
            "Tell me",
            "Do you feel the love?"
        };
        
            
            try {
                for (String line : songLyrics){
                    for(int i = 0; i < line.length(); i++){
                        System.out.print(line.charAt(i));
                        Thread.sleep(150);
                    }
                System.out.println();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
}
