package Oops.Encapsulation;

import java.lang.reflect.Field;

class Employee{
    private double salary;
    private String name;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary>0){
            this.salary = salary;
            System.out.println(salary);

        }
        else{
            System.out.println("Invalid amount");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsu {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");
        Employee employee=new Employee();
//        Field fsalary = Employee.class.getDeclaredField("salary");
//        fsalary.setAccessible(true);
//        System.out.println(fsalary.get(employee));
        employee.getSalary();
    }
}
