/**
 * author: akhilpathivada
 * time: 20/06/24 15:17
 */
package processor;

import lombok.NonNull;
import model.Account;
import model.CardDetails;
import model.User;
import model.request.Credintials;
import model.request.UserOnboardingDetails;
import model.response.DebitResponse;
import model.response.OnboardingResponse;

import java.util.HashMap;
import java.util.Map;

public class CreditCardProcessor {

    static  int count = 0;

    private final Map<Integer, Integer> userIdToCardIdMap;

    private final Map<Integer, Account> cardIdToAccountMap;

    public CreditCardProcessor() {
        this.cardIdToAccountMap =  new HashMap<>();
        this.userIdToCardIdMap = new HashMap<>();
    }

    // user onboarding
    public OnboardingResponse createUser(@NonNull UserOnboardingDetails userOnboardingDetails) {
        if (!isValidUser(userOnboardingDetails)) {
            return OnboardingResponse.CREDIT_CARD_DECLINED;
        }
        User user = createUser();
        CardDetails cardDetails = getCardDetails();
        userIdToCardIdMap.put(user.getUserId(), cardDetails.getCardNumber());

        // we need to send cardDetails as well
        return OnboardingResponse.CREDIT_CARD_APPROVED;
    }

    // debiting amount
    public DebitResponse debitAmount(@NonNull CardDetails cardDetails, Credintials credintials, double amount) {
        if (!isValidPin(credintials) || !hasSufficientFunds(cardDetails, amount)) {
            return DebitResponse.FAILED;
        }
        Account account = cardIdToAccountMap.get(cardDetails.getCardNumber());
        account.setBalance(account.getBalance() - amount);
        cardIdToAccountMap.put(cardDetails.getCardNumber(), account);
        return DebitResponse.SUCCESS;
    }

    private boolean isValidUser(UserOnboardingDetails userOnboardingDetails) {
        return userOnboardingDetails.getAge() >= 18 && userOnboardingDetails.getAge() < 50
                && userOnboardingDetails.getSalaryPerMonth() > 50;
    }

    private User createUser() {
        return new User();
    }

    private CardDetails getCardDetails() {
        return new CardDetails();
    }

    private boolean isValidPin(Credintials credintials) {
        return true;
    }

    private boolean hasSufficientFunds(CardDetails cardDetails, double amount) {
        return cardIdToAccountMap.get(cardDetails.getCardNumber()).getBalance() >= amount;
    }

}
