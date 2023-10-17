package JavaProgramme;

import java.util.Scanner;

/**
 * 17. Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Programme17_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // scanner object
        System.out.println("Enter a decimal number");
        String n = scn.next();
        int n1 = Integer.parseInt(n);
        String binary = Integer.toBinaryString(n1); // converter for binary number
        System.out.println("Binary number is :" + binary); // print statement for result
        scn.close();
    }
}
