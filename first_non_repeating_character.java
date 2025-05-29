import java.util.*;

public class first_non_repeating_character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter characters separated by space:");
        String input = scanner.nextLine().replaceAll("\\s+", "");
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        
        // Count occurrences of each character
        for (char c : input.toCharArray()) 
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        
        // Find the first non-repeating character
        char firstNonRepeating = input.chars()
                                       .mapToObj(c -> (char) c)
                                       .filter(c -> charCountMap.get(c) == 1)
                                       .findFirst()
                                       .orElse('\0');
        
        System.out.println(firstNonRepeating != '\0' 
                           ? "The first non-repeating character is: " + firstNonRepeating 
                           : "No non-repeating character found.");
    }
}
