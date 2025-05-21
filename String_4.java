import java.util.Scanner;

public class String_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println(input.equalsIgnoreCase(new StringBuilder(input).reverse().toString()) 
                           ? "The string is a palindrome." 
                           : "The string is not a palindrome.");
        scanner.close();
    }
}
