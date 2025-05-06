import java.util.Scanner;

public class Revese_A_Number {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid 3-digit number.");
        } else {
            int digit1 = number / 100; 
            int digit2 = (number / 10) % 10; 
            int digit3 = number % 10; 

            int reversedNumber = digit3 * 100 + digit2 * 10 + digit1;

            System.out.println("The reversed number is: " + reversedNumber);
        }

        scanner.close();
    }
}
