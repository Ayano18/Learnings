package Compro1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timot
 */
import java.util.*;

public class TGLA_12TaskPerformance1  {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        InitializeQuiz();

        int score = 0;

        for (int i = 0; i < questions; i++) {
            System.out.println(quizzes[i][0]);

            for (int j = 1; j <= 3; j++) {
                System.out.println(quizzes[i][j]);
            }

            System.out.print("Your answer: ");
            char Input = Character.toUpperCase(s.next().charAt(0));

            if (Input == quizzes[i][4].charAt(0)) {
                System.out.println("Correct!");
                System.out.println();
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + quizzes[i][4]);
                System.out.println();
            }
        }

        FinalScore(score);

        s.close();
    }
    
    private static int questions = 5;

    private static String[][] quizzes = new String[questions][5];

    private static void InitializeQuiz() {
        quizzes[0] = new String[]{"What is the primary objective of the game in League of Legends?", "A. Destroy the enemy Nexus", "B. Kill as many minions as possible", "C. Secure the most kills", "A"};
        quizzes[1] = new String[]{"Which role is responsible for supporting and protecting the team in League of Legends?", "A. Assassin", "B. Support", "C. Tank", "B"};
        quizzes[2] = new String[]{"What is the in-game currency used to purchase items and improve your champion's abilities?", "A. Mana", "B. Gold", "C. Experience Points", "B"};
        quizzes[3] = new String[]{"Which of the following is a popular game mode in League of Legends where players take on various challenges on a rotating map?", "A. Summoner's Rift", "B. ARAM (All Random All Mid)", "C. Twisted Treeline", "B"};
        quizzes[4] = new String[]{"What is the term used to describe the process of taking down multiple enemy champions in quick succession?", "A. Turret Dive", "B. Pentakill", "C. Backdoor", "B"};
    }

    private static void FinalScore(int score) {
        System.out.println("Your score is: " + score + " out of " + questions);
    }

}

