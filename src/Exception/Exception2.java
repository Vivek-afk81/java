package Exception;

import java.util.Scanner;


public class Exception2 extends Exception {
    public Exception2() {
        super("not allowed");
    }

    public Exception2(String msg) {
        super(msg);
    }
}

class Test {
    public static void main(String[] args) throws Exception2 {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 18) {
            throw new Exception2("hey, this is not allowed");
        } else {
            System.out.println("Allowed");
        }

        sc.close();
    }
}