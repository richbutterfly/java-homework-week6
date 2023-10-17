package JavaProgramme;

/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme14_Rectangle {
    public static void main(String[] args) {
        double w = 5.6;
        double h = 8.5;
        double area = (w * h); // formula for area of rectangle
        double perimeter = 2 * (w + h); // formula for perimeter of a rectangle
        System.out.println("Area of rectangle is " + area);
        System.out.println("Perimeter of rectangle is " + perimeter);

    }

}
