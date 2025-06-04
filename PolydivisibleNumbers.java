package Day_3;
import java.util.Scanner;




public class PolydivisibleNumbers {

    public static boolean isPolydivisible(String number) {
        for (int i = 1; i <= number.length(); i++) {
            int subNumber = Integer.parseInt(number.substring(0, i));
            if (subNumber % i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is polydivisible: ");
        String userInput = scanner.nextLine();

        if (isPolydivisible(userInput)) {
            System.out.println(userInput + " is a polydivisible number.");
        } else {
            System.out.println(userInput + " is not a polydivisible number.");
        }

        scanner.close();
    }
}