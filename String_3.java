import java.util.Scanner;

public class String_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        System.out.println("Number of vowels in the string: " + count);
        scanner.close();
    }
}
