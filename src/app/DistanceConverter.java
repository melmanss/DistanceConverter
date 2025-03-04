package app;

import java.util.Scanner;

public class DistanceConverter {
    public static double milesToKilometers(double miles) {

        System.out.println("App for distance converting");

        System.out.println("Version 1.0.");

        return miles * 1.60934;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть відстань в милях: ");
        double miles = scanner.nextDouble();
        System.out.printf("%.2f миль = %.2f км%n", miles, milesToKilometers(miles));

        System.out.print("Введіть відстань в кілометрах: ");
        double kilometers = scanner.nextDouble();
        System.out.printf("%.2f км = %.2f миль%n", kilometers, kilometersToMiles(kilometers));

        scanner.close();
    }
}
