/**
 * author: akhilpathivada
 * time: 27/05/24 10:12
 */
package facade;

public class Demo {

    public static void main(String[] args) {
        BookingFacade bookingFacade = new BookingFacade();
        bookingFacade.createBooking(new User(1, "name"), "movie");
    }
}
