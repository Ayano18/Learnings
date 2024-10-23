/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sauce;

/**
 *
 * @author Timot
 */
import java.util.Scanner;
public class quiz{
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int score = 0;
    String[] questions = {"1+1=?","2+2=?","3+3=?"};
    String[][] choices = {{
    "A. 2","B. 4","C. 6"},
    {"A. 2","B. 4","C. 6"},
    {"A. 2","B. 4","C. 6"}};
    char[] ans = {'A','B','C'}; 
    
    for(int i = 0; i < questions.length; i++){
        System.out.println(questions[i]);
        for(int j = 0; j < choices[i].length; j++){
            System.out.println(choices[i][j]);
        }
            System.out.print("Your ans:");
            char resp = s.nextLine().toUpperCase().charAt(0);
            if(resp == ans[i]){
                score++;
            }
            System.out.println();
    }
        System.out.println(score+"/"+questions.length);
        
    }
}

