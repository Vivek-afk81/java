package Exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exception1 {
    public static void main(String[] args) {
        System.out.println("Hellooo");
        System.out.println("Hellooo");

        System.out.println("are you");

        System.out.println("there");
        // unchecked exception
        try {
            System.out.println(100 / 0); // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        System.out.println("ohh an error occured");
        System.out.println("let's start again");
        // checked exception
        try {
            FileReader file = new FileReader("does_not_exist.txt");
            file.read();
            file.close();
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
        System.out.println("again,whyyyyy");
        System.out.println("let's do it some time later");
    }
}
