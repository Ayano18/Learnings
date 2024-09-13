import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class guessinggame {
    private String secretWord;
    private StringBuilder guessedWord;
    private ArrayList<String> wordList;
    private Random random;

    public guessinggame() {
        wordList = new ArrayList<>();
        random = new Random();
    }

    public void loadWordsFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Timot\\OneDrive\\Documents\\Advance learning\\FilePathJava\\" + filename));
        String line;
        while ((line = reader.readLine()) != null) {
            wordList.add(line);
        }
        reader.close();
    }

    public void newGame() {
        if (wordList.isEmpty()) {
            System.out.println("No words loaded. Please load words from file first.");
            return;
        }

        secretWord = wordList.get(random.nextInt(wordList.size()));
        guessedWord = new StringBuilder(secretWord.replaceAll("[a-zA-Z]", "?"));

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean gameOver = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Guess the word: " + guessedWord);

        while (!gameOver) {
            System.out.print("Enter a letter: ");
            String guess = scanner.nextLine().toLowerCase();

            if (guess.length() != 1 || !Character.isLetter(guess.charAt(0))) {
                System.out.println("Invalid input. Please enter a single letter.");
                continue;
            }

            char guessedLetter = guess.charAt(0);

            if (secretWord.toLowerCase().contains(guess)) {
                for (int i = 0; i < secretWord.length(); i++) {
                    if (Character.toLowerCase(secretWord.charAt(i)) == guessedLetter) {
                        guessedWord.setCharAt(i, secretWord.charAt(i));
                    }
                }
                System.out.println("Correct guess! Updated word: " + guessedWord);
                if (guessedWord.toString().equals(secretWord)) {
                    System.out.println("Congratulations! You guessed the word: " + secretWord);
                    gameOver = true;
                }
            } else {
                System.out.println("Letter not in the word. Try again.");
            }

            attempts++;
        }

        System.out.println("Total attempts: " + attempts);
    }

    public static void main(String[] args) {
        guessinggame game = new guessinggame();
        try {
            game.loadWordsFromFile("words.txt");
            game.newGame();
        } catch (IOException e) {
            System.out.println("Error loading words from file: " + e.getMessage());
        }
    }
}
