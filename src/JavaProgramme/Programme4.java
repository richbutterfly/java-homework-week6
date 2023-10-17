package JavaProgramme;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme
 */
public class Programme4 {
    int a = 10;
    String name = "Java";
    static int b = 20;
    static String test = "Good morning";

    public void method1() { // instance method
        System.out.println(a);
        System.out.println(name);
        System.out.println(b);
        System.out.println(test);
    }

    public static void method2() { // static method
        Programme4 v1 = new Programme4(); // object creation for instance to static area
        System.out.println(v1.a);
        System.out.println(v1.name);
        System.out.println(b);
        System.out.println(test);
    }

    public static void main(String[] args) {  // main method
        Programme4 obj = new Programme4(); // object creation for instance method to main method
        obj.method1();
        method2();
    }
}
