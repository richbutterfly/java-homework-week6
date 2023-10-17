package JavaProgramme;

/**
 * 16.Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 */

import java.util.Scanner;

public class Programme16_BinaryNumbers {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first binary number");
        String n = scn.next();
        System.out.println("Enter second binary number");
        String p = scn.next();

        int n1 = Integer.parseInt(n, 2);
        int p1 = Integer.parseInt(p, 2);
        int sum = n1 + p1;  // sum of two binary number
        String binary = Integer.toBinaryString(sum); // converts value
        System.out.println("Sum of two binary numbers: " + binary);
        scn.close();

    }
}

