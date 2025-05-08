public class Staircase_Problem {

    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print hashes
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6; // Example input
        staircase(n);
    }
}
