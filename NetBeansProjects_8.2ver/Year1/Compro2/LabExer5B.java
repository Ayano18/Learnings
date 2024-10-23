package Compro2;
import java.util.Scanner;

public class LabExer5B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "What is the capital of France?",
            "What is the largest planet in our solar system?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the chemical symbol for gold?",
            "What is the tallest mammal on Earth?",
            "What is the primary language spoken in Brazil?",
            "What is the largest ocean on Earth?",
            "What is the process by which plants make food?",
            "What is the tallest mountain in the world?",
            "Who painted the Mona Lisa?"
        };
        String[] answers = {"A", "B", "C", "A", "B", "C", "A", "B", "C", "A"};

        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.println("A) Choice A");
            System.out.println("B) Choice B");
            System.out.println("C) Choice C");
            System.out.print("Your answer (A/B/C): ");
            try {
                String userAnswer = scanner.nextLine().toUpperCase(); // Convert input to uppercase
                if (!userAnswer.equals("A") && !userAnswer.equals("B") && !userAnswer.equals("C")) {
                    throw new IllegalArgumentException("Invalid answer. Please choose A, B, or C.");
                }
                if (userAnswer.equals(answers[i])) {
                    score++;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Please answer again.");
                i--; // Repeat the same question
            }
        }
        System.out.println("Quiz completed. Your score: " + score + "/" + questions.length);
    }
}
