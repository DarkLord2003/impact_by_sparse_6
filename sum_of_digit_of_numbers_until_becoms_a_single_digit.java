public class sum_of_digit_of_numbers_until_becoms_a_single_digit {

    public static void main(String[] args) {
        int number = 9876; // Example number
        int result = sumOfDigitsUntilSingleDigit(number);
        System.out.println("The single digit sum is: " + result);
    }

    public static int sumOfDigitsUntilSingleDigit(int num) {
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        return num;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}


