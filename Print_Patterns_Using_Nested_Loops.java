public class Print_Patterns_Using_Nested_Loops {
    public static void main(String[] args) {
        int number = 1; 

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print(number + " "); 
                number++; 
            }
            System.out.println(); 
        }
    }
}