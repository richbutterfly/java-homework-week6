package JavaProgramme;
/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Programme7_Temperature {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double F = sc.nextDouble();
        double celsius = ((F - 32) * 5 / 9);
        System.out.println("Temperature in Celsius is: " + celsius);
        sc.close();

    }
}
