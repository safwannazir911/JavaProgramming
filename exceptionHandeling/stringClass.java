
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileReader;

public class stringClass {
    public static void main(String[] args) {
        // String greeting = "Hello, World! ";
        // String newString = greeting.concat("greeting");
        // System.out.println(newString); // Prints the length of the string

        // StringBuffer sb = new StringBuffer("Hello");
        // sb.append(" World");
        // System.out.println(sb); // Prints "Hello World"

        // StringBuilder sb = new StringBuilder("Hello");
        // sb.append(" World");
        // System.out.println(sb); // Prints "Hello World"

        // int num = 10;
        // Integer wrappedNum = Integer.valueOf(num); // Wrapping int to Integer
        // int unwrappedNum = wrappedNum.intValue(); // Unwrapping Integer to int

        // System.out.println(wrappedNum);
        // System.out.println(unwrappedNum);

        // try {
        // FileInputStream fis = new
        // FileInputStream("/home/safwannazir911/Desktop/data/test/bellpepper/Image_4.jpg");
        // int data;
        // while ((data = fis.read()) != -1) {
        // System.out.println(data); // Example: printing the data as characters
        // }
        // fis.close();
        // } catch (IOException e) {
        // e.printStackTrace(); // Handle the exception (e.g., print the stack trace)
        // }

        try {
            FileReader fr = new FileReader("/home/safwannazir911/Desktop/example.txt");
            int data;
            while ((data = fr.read()) != -1) {
                System.out.println(data);
            }
            fr.close();

        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception (e.g., print the stack trace)
        }

    }
}
