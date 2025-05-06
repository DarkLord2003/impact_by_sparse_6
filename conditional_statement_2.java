import java.util.Scanner;

public class conditional_statement_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            int middleDigit = (number / 10) % 10; // Extract the middle digit

            if (middleDigit % 3 == 0) {
                System.out.println("This is a trendy number.");
            } else {
                System.out.println("This is not a trendy number.");
            }
        } else {
            System.out.println("Please enter a valid 3-digit number.");
        }

        scanner.close();
    }
}
