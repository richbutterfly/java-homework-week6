package JavaProgramme;

//15. Write a Java program to swap two variables

public class Programme15_Variables {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        System.out.println("Before swapping a = " + a + " and b =" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(" After swapping a = " + a + " and b =" + b);

    }
}
