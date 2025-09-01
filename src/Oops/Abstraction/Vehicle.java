package Oops.Abstraction;

abstract public class Vehicle {
    int no_tyre;
    void common(){
        System.out.println("this is common");
    }

    abstract  void stop();

    public static void main(String[] args) {
        Car car=new Car();
        car.no_tyre=4;
        car.stop();
    }
}
