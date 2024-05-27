/**
 * author: akhilpathivada
 * time: 27/05/24 10:08
 */
package facade;

public class BookingFacade {

    private final TicketSystem ticketSystem;

    private final PaymentSystem paymentSystem;

    private final NotificationSystem notificationSystem;

    public BookingFacade() {
        this.ticketSystem = new TicketSystem();
        this.paymentSystem = new PaymentSystem();
        this.notificationSystem = new NotificationSystem();
    }

    public void createBooking(User user, String movie) {
        if (!ticketSystem.isBookingAllowed(movie)) {
            return;
        }
        ticketSystem.createTicket(user, movie);
        paymentSystem.charge(123, "cardDetails");
        notificationSystem.sendSMS("message");
    }
}
