import java.util.Scanner;

public class Reverse_Each_Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Reversed words string:");
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            reversedString.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        System.out.println(reversedString.toString().trim());
        scanner.close();
    }
}
