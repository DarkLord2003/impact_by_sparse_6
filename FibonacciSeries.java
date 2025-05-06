import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of months: ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;

        System.out.print("Amoeba size over " + n + " months: ");

        for (int i = 0; i < n; i++) {
            System.out.print(first);
            int next = first + second;
            first = second;
            second = next;
        }

        sc.close(); 
    }
}