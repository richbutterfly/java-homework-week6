package JavaProgramme;

import java.util.Scanner;

// Write a program to convert the upper case to lower case
public class Programme9_Uppercase {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upper case");
        String text = sc.nextLine();
        System.out.println(text.toLowerCase());
        sc.close();
    }
}
