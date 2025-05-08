import java.util.Scanner;

public class Finding_Capriker_Number_Or_Not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isKaprekar(num)) {
            System.out.println(num + " is a Kaprekar number.");
        } else {
            System.out.println(num + " is not a Kaprekar number.");
        }
    }

    public static boolean isKaprekar(int num) {
        if (num < 1) {
            return false;
        }

        long square = (long) num * num;
        long divisor = 1;

        while (divisor <= square) {
            long leftPart = square / divisor;
            long rightPart = square % divisor;

            if (rightPart > 0 && leftPart + rightPart == num) {
                return true;
            }

            divisor *= 10;
        }

        return false;
    }
}