/**
 * author: akhilpathivada
 * time: 06/05/24 07:18
 */
package org.example;

import java.util.Date;

public class BookItem extends Book {

    // book item is a unique copy of a book

    String barcode;

    Date publicationDate;

    Rack rackLocation;

    BookStatus bookStatus;

    BookFormat bookFormat;
}
