package JavaProgramme;

import java.util.Scanner;
//Write a program to calculate the area of a triangle.

public class Programme8_Triangle {

    public static void main (String [] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the triangle");
        double b = sc.nextDouble();
        System.out.println("Enter the height of the triangle");
        double h = sc.nextDouble();
        double area = b * h / 2;
        System.out.println("Area of the triangle is :" + area);
        sc.close();
    }
}
