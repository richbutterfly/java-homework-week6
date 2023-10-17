package JavaProgramme;

/**
 * 19.Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog
 */
public class Programme19_ConvertStringToLowercase {
    public static void main(String[] args) {
        String text = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String l = text.toLowerCase(); // convert text to lower case
        System.out.println(l);

    }
}
