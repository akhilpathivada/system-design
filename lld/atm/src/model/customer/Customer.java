/**
 * author: akhilpathivada
 * time: 06/05/24 11:45
 */
package model.customer;

import model.Account;
import model.card.CardInfo;
import service.BankService;

public class Customer {

    int id;

    CardInfo cardInfo;

    BankService bankService;

    Account account;

    CustomerStatus customerStatus;
}
