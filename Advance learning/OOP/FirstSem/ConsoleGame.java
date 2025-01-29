import java.util.Scanner;

interface GameMode {
    void displayMode();
}

interface Player {
    void setName(String name);
    String getName();
}

interface GameStart {
    void startGame();
}

class StoryMode implements GameMode {
    public void displayMode() {
        System.out.println("You selected Story Mode. Enjoy the adventure!");
    }
}

class SurvivalMode implements GameMode {
    public void displayMode() {
        System.out.println("You selected Survival Mode. Good luck surviving!");
    }
}

class TextGame implements Player, GameStart {
    private String playerName;
    private GameMode selectedMode;

    @Override
    public void setName(String name) {
        this.playerName = name;
    }

    @Override
    public String getName() {
        return playerName;
    }

    public void selectMode(int mode) {
        if (mode == 1) {
            selectedMode = new StoryMode();
        } else if (mode == 2) {
            selectedMode = new SurvivalMode();
        } else {
            System.out.println("Invalid selection. Defaulting to Story Mode.");
            selectedMode = new StoryMode();
        }
    }

    @Override
    public void startGame() {
        if (selectedMode != null) {
            System.out.println("Press P to start playing, " + playerName + ".");
            Scanner s = new Scanner(System.in);
            String input = s.nextLine();
            if (input.equalsIgnoreCase("P")) {
                selectedMode.displayMode();
                System.out.print("Game is starting");
                for(int i = 0; i <= 5; i++){
                    String dot = ".";
                        
                        try{
                            Thread.sleep(1000);
                            System.out.print(dot.charAt(0));
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                }
                System.out.println(" Have fun, " + playerName + "!");
            } else {
                System.out.println("Invalid input. Please restart the game.");
            }
        } else {
            System.out.println("No game mode selected. Please restart the game.");
        }
    }
}

public class ConsoleGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TextGame game = new TextGame();

        System.out.print("Enter your name: ");
        String name = s.nextLine();
        game.setName(name);

        System.out.println("Press 1 or 2 to select your game mode.");
        System.out.println("1 - Story");
        System.out.println("2 - Survival");
        int mode = s.nextInt();
        game.selectMode(mode);

        game.startGame();
    }
}
