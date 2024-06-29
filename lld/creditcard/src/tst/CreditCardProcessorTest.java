/**
 * author: akhilpathivada
 * time: 20/06/24 15:44
 */
package tst;


import model.Account;
import model.request.UserOnboardingDetails;
import model.response.OnboardingResponse;
import processor.CreditCardProcessor;

import java.util.HashMap;
import java.util.Map;

public class CreditCardProcessorTest {


    CreditCardProcessor creditCardProcessor;

    Map<Integer, Integer> userIdToCardIdMap;

     Map<Integer, Account> cardIdToAccountMap;

    @BeforeClass
    public void init() {
        this.creditCardProcessor = new CreditCardProcessor();
        this.cardIdToAccountMap =  new HashMap<>();
        this.userIdToCardIdMap = new HashMap<>();
        cardIdToAccountMap.put(1, new Account());
        userIdToCardIdMap.put(1, 234);
    }

    void testCreateUser_Success() {
        UserOnboardingDetails userOnboardingDetails = new UserOnboardingDetails(112, null, 45);
        assertEquals(OnboardingResponse.CREDIT_CARD_APPROVED, creditCardProcessor.createUser(userOnboardingDetails));
    }

    void testCreateUser_Failure_InsufficientSalary() {
        UserOnboardingDetails userOnboardingDetails = new UserOnboardingDetails(12, null, 45);
        assertEquals(OnboardingResponse.CREDIT_CARD_DECLINED, creditCardProcessor.createUser(userOnboardingDetails));
    }
}
