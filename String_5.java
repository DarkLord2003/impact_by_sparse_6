import java.util.Scanner;
import java.util.stream.IntStream;

public class String_5 {
    public static void main(String[] args) {
        boolean[] present = new boolean[26];
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        input.chars().filter(c -> c >= 'a' && c <= 'z').forEach(c -> present[c - 'a'] = true);
        int smallestMissing = IntStream.range(0, 26).filter(i -> !present[i]).findFirst().orElse(-1);
        System.out.println("Smallest missing character: " + (smallestMissing == -1 ? "None" : (char) (smallestMissing + 'a')));
    }
}
