import java.util.Arrays;
import java.util.Scanner;

public class TreasureBoxDecoder {

    // Function to compute GCD of two numbers
    public static int gcd(int a, int b) {
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to compute GCD of three numbers
    public static int gcdOfThree(int a, int b, int c) {
        return gcd(gcd(a, b), c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: three integers
        int[] boxes = new int[3];
        for(int i = 0; i < 3; i++) {
            boxes[i] = scanner.nextInt();
        }

        // Sort to get the second largest number
        Arrays.sort(boxes);
        int secondLargest = boxes[1]; // since sorted: boxes[0] < boxes[1] < boxes[2]

        // Get the GCD of all three numbers
        int code = gcdOfThree(boxes[0], boxes[1], boxes[2]);

        // Output
        System.out.println("Second largest number on top: " + secondLargest);
        System.out.println("Code to open the box: " + code);
        
        scanner.close();
    }
}
