import java.util.Scanner;

public class String_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count vowels
        int vowelCount = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        // Print the result
        System.out.println("Number of vowels in the string: " + vowelCount);

        scanner.close();
    }
}