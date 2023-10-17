package JavaProgramme;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Programme5_Calculation {
    // Two instance method with concatenation method
    public void addition(int a, int b) {
        int result = a + b;
        System.out.println("Addition of " + a + " and " + b + " is : " + result);
    }

    public void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is : " + result);
    }

    // Two static method with concatenation method
    public static void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is : " + result);
    }

    public static void division(int a, int b) {
        int result = a / b;
        System.out.println("Division of " + a + " and " + b + " is : " + result);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        Programme5_Calculation obj = new Programme5_Calculation(); //   object creation for instance method
        obj.addition(a, b);
        obj.subtraction(a, b);
        multiplication(a, b);
        division(a, b);
        sc.close();

    }
}
