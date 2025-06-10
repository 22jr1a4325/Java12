import java.util.Scanner;
class Booking{
    void bookTicket(){
        System.out.println("Booking a general ticket - any mode");
    }
}
class TrainBooking extends Booking{
    void bookTicket(){
        System.out.println("Train Ticket Booking Successfully......");
        System.out.println("Seat: L8 | Coach:B2 | Cost: RS1000");
    }
}
class FlightBooking extends Booking{
    void bookTicket(){
        System.out.println("Flight Ticket Booked Successfully.....");
        System.out.println("Seat: 16A | Service: Indigo | fare: RS6000");
    }
}
class CabBooking extends Booking{
    void bookTicket(){
        System.out.println("Cab Ride Booked Successfully....");
        System.out.println("Vehicle: sedan | Driver: Sirisha | Estimated Fare: RS400");
    }
}
class CruiseBooking extends Booking{
    void bookTicket(){
        System.out.println("Cruise Sail Booked Successfully....");
        System.out.println("Cabin: Front View | Deck: 3 | Fare: RS11400");
    }
}
class BusBooking extends Booking{
    void bookTicket(){
        System.out.println("Bus Seat Booked Successfully....");
        System.out.println("Seat: 21w | Service: 'Orange Travels' | Number: 2323");
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Booking booking;
        System.out.println("Enter your mode of travel: ");
        System.out.println("1.Train");
        System.out.println("2.Bus");
        System.out.println("3.Flight");
        System.out.println("4.Cab");
        System.out.println("5.Cruise");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                booking = new TrainBooking();
                break;
            case 2:
                booking = new BusBooking();
                break;
            case 3:
                booking = new FlightBooking();
                break;
            case 4:
                booking = new CabBooking();
                break;
            case 5:
                booking = new CruiseBooking();
                break;
            default:
            booking = new Booking();
        }
        System.out.println("\n Processing your booking.....");
        booking.bookTicket();
    }
}