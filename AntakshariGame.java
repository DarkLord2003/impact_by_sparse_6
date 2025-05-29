import java.util.*;

public class AntakshariGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> usedWords = new HashSet<>();
        List<String> player1Words = new ArrayList<>();
        List<String> player2Words = new ArrayList<>();
        String lastChar = "";
        int turn = 0;

        System.out.println("🎤 Welcome to the Antakshari Game!");
        System.out.println("Rules:");
        System.out.println("1. Each word must start with the last letter of the previous word.");
        System.out.println("2. No word repetition allowed.");
        System.out.println("3. Game ends if a wrong word is entered.\n");

        while (true) {
            String player = (turn % 2 == 0) ? "Player 1" : "Player 2";
            System.out.print(player + ", enter a word: ");
            String word = scanner.nextLine().trim().toLowerCase();

            // Exit condition
            if (word.equals("exit")) {
                System.out.println("\nGame exited by user.");
                break;
            }

            // Check valid input
            if (!word.matches("[a-zA-Z]+")) {
                System.out.println("❌ Invalid input. Only letters allowed.");
                break;
            }

            // Check if already used
            if (usedWords.contains(word)) {
                System.out.println("❌ Word already used. Game over!");
                break;
            }

            // Check if it starts with the last character
            if (!lastChar.isEmpty() && word.charAt(0) != lastChar.charAt(0)) {
                System.out.println("❌ Word must start with '" + lastChar + "'. Game over!");
                break;
            }

            // Valid word
            usedWords.add(word);
            if (turn % 2 == 0) {
                player1Words.add(word);
            } else {
                player2Words.add(word);
            }

            lastChar = String.valueOf(word.charAt(word.length() - 1));
            turn++;
        }

        // Print game result
        System.out.println("\n🎉 Game Over! Here's the summary:");
        System.out.println("Player 1 words: " + player1Words);
        System.out.println("Player 2 words: " + player2Words);

        scanner.close();
    }
}
