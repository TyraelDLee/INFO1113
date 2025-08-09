package Week1;

import java.util.Scanner;

public class GoldenRatio {
    private static boolean isGoldenRation(double v1, double v2){
        double r1 = Math.round((v1 + v2) / v1 * 1000d) / 1000d;
        // 1000d is 1000 in double type, also can be written as 1000.0 or (double) Math.round((v1 + v2) / v1 * 1000) / 1000
        double r2 = Math.round((v1 / v2) * 1000d) / 1000d;;
        return r1 == r2;
    }

    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        double v1 = 0, v2 = 0;
        if (!scanner.hasNextDouble()){
            System.out.println("\nInvalid input.");
            return;
        }else
            v1 = scanner.nextDouble();
        if (!scanner.hasNextDouble()){
            System.out.println("\nInvalid input.");
            return;
        }else
            v2 = scanner.nextDouble();

        String result = isGoldenRation(v1, v2) || isGoldenRation(v2, v1)?"\nGolden ratio!":"\nMaybe next time.";
        System.out.println(result);
        /*
        String result = isGoldenRation(v1, v2) || isGoldenRation(v2, v1)?"\nGolden ratio!":"\nMaybe next time.";
        System.out.println(result);

        IS EQUAL TO:

        if (isGoldenRation(v1, v2) || isGoldenRation(v2, v1))
            System.out.println("\nGolden ratio!");
        else
            System.out.println("\nMaybe next time.");
         */
    }
}