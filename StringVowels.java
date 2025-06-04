package Day_2;

public class StringVowels {
    public static boolean hasVowels(String input) {
        // Define a string containing all vowels
        String vowels = "Raahi";
        
        
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                return true; 
            }
        }
        
        return false; 
    }

    public static void main(String[] args) {
        String testString = "Hello World!";
        if (hasVowels(testString)) {
            System.out.println("The string has vowels.");
        } else {
            System.out.println("The string does not have vowels.");
        }
    }
}

