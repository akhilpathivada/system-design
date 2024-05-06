/**
 * author: akhilpathivada
 * time: 06/05/24 11:42
 */
package factory;

import model.card.CardInfo;
import service.BankAService;
import service.BankBService;
import service.BankService;

public class BankServiceFactory {

    public BankService getBankServiceObject(CardInfo cardInfo) {
        switch (cardInfo.getBank()) {
            case 'A':
                return new BankAService();
            case 'B':
                return new BankBService();
        }
    }
}
