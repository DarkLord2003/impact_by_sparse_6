public class Reverse_Staircase {
    public static void main(String[] args) {
        int n = 5; // Height of the staircase

        System.out.println("Reverse Staircase and Mirror Image Opposite to Each Other:");
        for (int i = n; i >= 1; i--) {
            // Mirror Image of Reverse Staircase
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Space between the two patterns
            System.out.print("   ");

            // Reverse Staircase
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}