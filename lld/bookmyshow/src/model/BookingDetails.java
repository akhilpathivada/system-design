/**
 * author: akhilpathivada
 * time: 06/05/24 08:15
 */
package model;

import java.util.Date;
import java.util.List;

public class BookingDetails {

    int id;

    Date bookingDate;

    Account account;

    Theatre theatre;

    Show show;

    Audi audi;

    List<Seat> seatsBooked;

    PaymentStatus paymentStatus;

}
