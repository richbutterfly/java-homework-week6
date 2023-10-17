package JavaProgramme;

/**
 * 12. Write a Java program to compute the specified expressions and print the
 * output.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */
public class Programme12_Expressions {
    public static void main(String[] args) {
        double a = 25.5;
        double b = 3.5;
        double c = 40.5;
        double d = 4.5;
        double e = ((a * b - b * b) / (c - d));
        System.out.println(e);
    }
}
