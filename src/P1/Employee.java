package P1;
import java.util.*;
public class Employee {

    int nEmp;
    String sName;
    String sAddress;
    long nSal;

    void mCalcIncome(long nSal){
        System.out.println("return income tax");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        e1.nEmp= 1234;
        e1.sName= "vlad_of_soara";
        e1.nEmp = sc.nextInt();
        e1.sAddress="delhi";

        Employee e2 = new Employee();
        e2.nEmp= 4321;
        e2.sName= "gon_of_shilling";



        e2.mCalcIncome(12345);
        System.out.println("e1 employee id is"+ e1.nEmp);
        System.out.println("e1 employee name is"+ e1.sName);
    }
}
