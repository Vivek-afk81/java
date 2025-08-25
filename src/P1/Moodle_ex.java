package P1;
import java.util.Scanner;

public class Moodle_ex {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                int num = Integer.parseInt(args[i]); // convert String to int
                sum += num; // add to sum
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + args[i]);
            }
        }

        System.out.println("Sum = " + sum);
    }
}







