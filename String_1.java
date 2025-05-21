import java.util.HashMap;
import java.util.Scanner;

public class String_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Calculate the frequency of each letter
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) { // Only consider letters
                c = Character.toLowerCase(c); // Convert to lowercase for case insensitivity
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print the frequency of each letter
        System.out.println("Letter frequencies:");
        for (char c : frequencyMap.keySet()) {
            System.out.println(c + ": " + frequencyMap.get(c));
        }

        scanner.close();
    }
}