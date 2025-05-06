import java.util.Scanner;

// Author: Krish Taresh Patel
// Date: 06-05-2025

public class special_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();

        int digit1 = number / 10; // Extract the first digit
        int digit2 = number % 10; // Extract the second digit

        int sum = digit1 + digit2; // Sum of the two digits
        int product = digit1 * digit2; // Product of the two digits

        System.out.println("Sum of the digits: " + sum);
        System.out.println("Product of the digits: " + product);

        int finalResult = sum + product; // Add both results
        System.out.println("Final result (sum + product): " + finalResult);

        // Conditional statement to check if the number is a special number
        if (finalResult == number) {
            System.out.println(number + " is a special number.");
        } else {
            System.out.println(number + " is not a special number.");
        }

        scanner.close();
    }
}
