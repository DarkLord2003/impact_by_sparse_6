import java.util.Scanner;

public class Colatz_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        System.out.println("Collatz sequence:");
        
        int count = 0; // Initialize the counter
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            count++; // Increment the counter
        }
        System.out.println(1); 
        System.out.println("Total iterations: " + count); // Print the iteration count

        sc.close();
    }
}
