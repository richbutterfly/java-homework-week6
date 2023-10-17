package JavaProgramme;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Programme1 {
    int k = 100;// k in an instance variable
    String name = "Spider man";// name is an instance variable

    public void m1() {
        System.out.println(k);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Programme1 obj = new Programme1(); // object created for main method
        obj.m1();

    }
}
