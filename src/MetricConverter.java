import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double M_TO_MI = 0.00062137;
        final double M_TO_F = 3.28084;
        final double M_TO_I = 39.370078402;

        double meter;

        System.out.println("How many meters?");
        do {
            if (scan.hasNextDouble()) {
                meter = scan.nextDouble();
                if (meter > 0) {
                    break;
                }
            }
            scan.nextLine();
            System.out.println("Please enter a valid input");
        } while (true);

        // Calculations
        double metersToMiles = meter * M_TO_MI;
        double metersToFeet = meter * M_TO_F;
        double metersToInches = meter * M_TO_I;

        // Outputs
        System.out.printf("%-8s %.2f", "Meters:", meter);
        System.out.printf("\n%-7s %.2f", "Inches:", metersToInches);
        System.out.printf("\n%-5s %.2f", "Feet:", metersToFeet);
        System.out.printf("\n%-6s %.2f", "Miles:", metersToMiles);

    }
}