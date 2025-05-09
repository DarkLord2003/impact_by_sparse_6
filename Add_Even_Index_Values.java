import java.util.Scanner;

public class Add_Even_Index_Values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the size of the array as input
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        int[] array = new int[size];

        // Take array elements as input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of elements at even indices
        int sum = 0;
        System.out.println("\nArray elements and their indices:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + array[i]);
            if (i % 2 == 0) { // Check if the index is even
                sum += array[i];
            }
        }

        // Display the result
        System.out.println("\nSum of elements at even indices: " + sum);

        scanner.close();
    }
}