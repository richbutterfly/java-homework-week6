package JavaProgramme;

/**
 * 13. Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

import java.util.Scanner;

public class Programme13_AvgNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();
        int avg = (num1 + num2 + num3) / 2;
        System.out.println("Average of the numbers is " + avg);
        sc.close();
    }
}
