class TicketBooking {
    int availableTickets = 10;
    synchronized void bookTicket(String customerName, int tickets) {
        System.out.println(customerName + " wants to book "+ tickets + " tickets");
        if (tickets <= availableTickets)
    {
           System.out.println(customerName + "is booking tickets");
        try {
           Thread.sleep(4000); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        availableTickets = availableTickets - tickets;
        System.out.println(customerName + "Successfully booked" + tickets + "tickets");
        System.out.println("Tickets remaining " + availableTickets);
    } 
    else {
        System.out.println(customerName + "- Not enough tickets available");
        System.out.println("Tickets remaining " + availableTickets);
    }
     System.out.println(" ");
}
}
class Customer extends Thread {
    TicketBooking booking;
    String customerName;
    int tickets;
    Customer (TicketBooking booking, String customerName, int tickets) {
        this.booking = booking;
        this.customerName = customerName;
        this.tickets = tickets;
    }
    public void run() {
        booking.bookTicket(customerName, tickets);
    }
}
public class MultithreadExample {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();
        Customer c1 = new Customer(booking, "Customer 1",4);
        Customer c2 = new Customer(booking, "Customer 2",5);
        Customer c3 = new Customer(booking, "Customer 3",6);
        c1.start();
        c2.start();
        c3.start();
    }
}