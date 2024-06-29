/**
 * author: akhilpathivada
 * time: 20/06/24 15:10
 */
package model;

import lombok.Data;

@Data
public class CardDetails {

    int cardNumber;

    String nameOnCard;

    String cvv;

    int expiryDate;

    CreditCardType creditCardType;

    CreditCardStatus creditCardStatus;
}
