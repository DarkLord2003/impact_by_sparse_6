import java.util.Scanner;

public class Checking_for_Adam_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isAdamNumber(number)) {
            System.out.println(number + " is an Adam's number.");
        } else {
            System.out.println(number + " is not an Adam's number.");
        }

        scanner.close();
    }

    public static boolean isAdamNumber(int number) {
        int reversedNumber = reverse(number);
        int squareOfNumber = number * number;
        int squareOfReversed = reversedNumber * reversedNumber;

        return squareOfNumber == reverse(squareOfReversed);
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}