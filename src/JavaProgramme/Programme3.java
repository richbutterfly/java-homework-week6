package JavaProgramme;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme
 */
public class Programme3 {
    int a = 5;
    int b = 5;
    int ans = a + b; // a and b both are instance variables
    static String name = "Superman"; // name is a static variable

    public void s1() {
        System.out.println(a + b); // instance to instance calling direct access
        System.out.println(name);
        s2();
    }

    public static void s2() {
        Programme3 m1 = new Programme3(); // object creation for instance to static
        System.out.println(name); // static to static calling direct access
        System.out.println(m1.ans);
    }

    public static void main(String[] args) {
        Programme3 obj = new Programme3(); // object creation for instance method s1
        obj.s1();
        s2();

    }
}
