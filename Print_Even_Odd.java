//Author: Krish Taresh Patel
//Date: 2023-10-01


import java.util.Scanner;


public class Print_Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single digit number: ");
        
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            if (number >= 0 && number <= 9) {
                if (number == 0) {
                    System.out.println("0");
                } else if (number % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid");
        }
        
        scanner.close();
    }
}

//Description:
// This code is a simple Java program that checks if a single digit number is even or odd.
// The code checks if the input is a single digit number (0-9) and prints "Even" or "Odd" accordingly.
// If the input is not a single digit number, it prints "Invalid".
// The code uses a Scanner to read user input and checks if the input is an integer.
// It also handles the case where the input is not a number by using hasNextInt() method.
// The program is designed to be user-friendly and provides clear feedback based on the input.