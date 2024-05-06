/**
 * author: akhilpathivada
 * time: 06/05/24 11:24
 */
package service;

import factory.BankServiceFactory;
import model.*;

public class ATMService {

    int atmId;

    Address address;

    Screen screen;

    Keypad keypad;

    CardReader cardReader;

    CashDispenser cashDispenser;

    CashDepositer cashDepositer;

    ChequeDepositer chequeDepositer;

    BankServiceFactory bankServiceFactory;
}
