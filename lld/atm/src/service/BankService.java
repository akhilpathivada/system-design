/**
 * author: akhilpathivada
 * time: 06/05/24 11:27
 */
package service;

import model.card.CardInfo;
import model.transaction.Transaction;
import model.transaction.TransactionDetails;

public interface BankService {

    boolean isValidUser(CardInfo cardInfo);

    Customer getCustomerDetails(CardInfo cardInfo);

    TransactionDetails executeTransaction(Transaction transaction);

}
