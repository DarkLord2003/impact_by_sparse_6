public class Even_Numbers_Array {
    public static void main(String[] args) {
        int[] evenNumbers = new int[10];
        int index = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                evenNumbers[index] = i;
                index++;
            }
        }

        // Print the array to verify
        System.out.print("Even numbers from 1 to 20: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
    }
}
