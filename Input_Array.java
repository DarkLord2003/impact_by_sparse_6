import java.util.Scanner;

public class Input_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}