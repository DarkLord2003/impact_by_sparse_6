package Impact_Traning.Week_1.Day_2;

import java.util.Scanner;

public class HotelTariffCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int month = scanner.nextInt();
        int rentPerDay = scanner.nextInt();
        int numberOfDays = scanner.nextInt();

        // Validate month
        if (month < 1 || month > 12) {
            System.out.println("Invalid Input");
            return;
        }

        // Check for peak season
        boolean isPeakSeason = (month >= 4 && month <= 6) || (month >= 11 && month <= 12);

        // Calculate total tariff
        double totalTariff;
        if (isPeakSeason) {
            totalTariff = rentPerDay * numberOfDays * 1.20; // 20% increase
        } else {
            totalTariff = rentPerDay * numberOfDays;
        }

        // Output
        System.out.printf("Hotel Tariff: %.2f%n", totalTariff);
    }
}
