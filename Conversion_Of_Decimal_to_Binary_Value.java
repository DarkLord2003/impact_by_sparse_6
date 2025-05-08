import java.util.Scanner;

public class Conversion_Of_Decimal_to_Binary_Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        
        System.out.print("Binary value: ");
        convertToBinary(decimal);

        scanner.close();
    }

    public static void convertToBinary(int decimal) {
        int[] binary = new int[32]; 
        int index = 0;

        if (decimal == 0) {
            System.out.print(0);
            return;
        }

        while (decimal > 0) {
            binary[index++] = decimal % 2; 
            decimal = decimal / 2; 
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}

