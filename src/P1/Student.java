package P1;

// Creating a class
public class Student {

    // Attributes ==Properties == state == variable

    String Name;
    long roll_no;
    String Branch = "CS";
    char Section = 'D';

    int[] aMarks= new int[10];

    // Methods = Functions in C

    void CheckResult()
    {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        // Creating an object in java
        Student st1 = new Student();
        Student st2 = new Student();

        st1.Name = "vivek";
        st2.Name ="vlad_of_soara";
        Student st3 = new Student();
        st3.roll_no = 1234;
        System.out.println("1st student name is : " + st1.Name);
    }

}
