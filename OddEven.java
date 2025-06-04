package Day_2;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 2 != 0) {
                System.out.println("The number is odd.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
