package JavaProgramme;

import java.util.Scanner;

/*18. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
public class Programme18_PrintTheSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number"); // get input from user
        int a = scn.nextInt();
        System.out.println("Enter second number"); // get input from user
        int b = scn.nextInt();

        int add = a + b;
        int sub = a - b;
        int multi = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " - " + b + " =" + sub);
        System.out.println(a + " * " + b + " = " + multi);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " mod " + b + " = " + mod);
        scn.close();

    }
}
