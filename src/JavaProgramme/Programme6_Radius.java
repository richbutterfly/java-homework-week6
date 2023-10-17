package JavaProgramme;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r)
 */
public class Programme6_Radius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle : ");
        double r = sc.nextDouble();
        double area = 3.14 * r * r;
        System.out.println("Area of the circle is :" + area);
        sc.close();

    }
}
