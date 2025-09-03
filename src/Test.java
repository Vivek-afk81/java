abstract class Booking{
    String booking_id;
    double price;

    Booking(double amount,String booking_id){
        this.price=amount;
        this.booking_id=booking_id;
    }
    void Receipt(){
        System.out.println("Receipt: "+booking_id+"amount ="+price);
    }
    abstract void processPayment();}

interface Refunds{
    void refund(double price);

}
class BusRide extends Booking implements Refunds{
    String busNumber;

    BusRide(double amount,String booking_id,String busNumber){
        super(amount,booking_id);
        this.busNumber=busNumber;
    }

    @Override
    void processPayment(){
        System.out.println("your payment is processing of:"+price);
    }
    @Override
    public void refund(double price) {
        System.out.println("Refunding " + price + " for bus booking " + booking_id);
    }
}
class TrainRide extends Booking implements Refunds{
    String trainNumber;

    TrainRide(double amount,String booking_id,String trainNumber){
        super(amount, booking_id);
        this.trainNumber=trainNumber;
    }
    @Override
    void processPayment(){
        System.out.println("your payment is processing of"+price);
    }
    @Override
    public void refund(double price) {
        System.out.println("Refunding " + price + " for train booking " + booking_id);
    }
}
class CabRide extends Booking implements Refunds{
    String carNumber;

    CabRide(double amount,String booking_id,String carNumber){
        super(amount, booking_id);
        this.carNumber=carNumber;
    }
    @Override
    void processPayment(){
        System.out.println("your payment is processing of"+price);
    }
    @Override
    public void refund(double price) {
        System.out.println("Refunding " + price + " for cab booking " + booking_id);
    }

}


public class Test {
    public static void main(String[] args) {
        CabRide c = new CabRide(500,"CAB101","UP14AB");
        BusRide b = new BusRide(200,"BUS303","UP54CD");
        TrainRide t = new TrainRide(1200,"TRN202","GMT2145");

        b.processPayment();
        b.Receipt();
        b.refund(150.0);

        c.processPayment();
        c.Receipt();
        c.refund(300.0);

        t.processPayment();
        t.Receipt();
        t.refund(1000.0);


    }
}
