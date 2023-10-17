package JavaProgramme;

/**
 * 2. Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme
 */
public class Programme2 {
    static int r = 30; // r is a static variable
    static String name = "Batman"; // name is a static variable

    public static void p1() {
        System.out.println(r);
        System.out.println(name);
    }

    public static void main(String[] args) {
        p1();       //  static to static direct access
    }
}
