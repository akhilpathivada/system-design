/**
 * author: akhilpathivada
 * time: 06/05/24 07:35
 */
package org.example.service;

import org.example.BookItem;
import org.example.actor.LibraryUser;

public class BookIssueService {

    FineService fineService;

    public BookReservationDetail updateReservationDetail(BookReservationDetail bookReservationDetail) {

    }

    public BookReservationDetail getReservationDetail(BookItem bookItem) {
        // if the book is not reserved then only we can assign it to someone
    }

    public BookReservationDetail updateReservationDetail(BookReservationDetail bookReservationDetail) {

    }

    public BookReservationDetail reserveBook(BookItem bookItem, LibraryUser user) {
        // check if the book is not reserved then only we can assign it to someone
        BookReservationDetail bookReservationDetail = getReservationDetail(bookItem);
    }

    public BookIssueDetail issueBook(BookItem bookItem, LibraryUser user) {

    }

    public void returnBook(BookItem bookItem, LibraryUser user) {

    }
}
