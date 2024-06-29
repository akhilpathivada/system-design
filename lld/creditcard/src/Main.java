
public class Main {

    public static void main(String[] args) {
        // 1. debiting amount -> paying money through swipe,
        // 2. checking balance
        // 3. paying back money to the bank
        // 4. notifications - sms, email, phone call
        // 5. user Onboarding ->
        // 1. cibil score > 700 2. salary > 50k/month 3. age > 18 < 50


    }
}

/**
 *
 * User onboarding: /createUser/ - post/ (user_details); return Declined / Card details
 *   1. user validation (checking whether user is meeting constraionts)
 *   2. assign creadit card
 *   3. UserManager : store the (user, card) into our databse (map) Map<Integer, Interger> = hasmap()
 *
 * debiing amoiunt: (payment processor) /debitAmount - post (card_details, credintails, amount) : return success/failure
 *  1. validate pin, card_details
 *  2. check enough funds are there or not
 *  3. based on payment strategy go and debit the amount, atomic operations accountDetails should get updated
 *  4. based on the  success/failure response from payment processor, just send the notifcation
 *
 *  checking balance: (Account: user_details, card_detrail, funds/balance) /checkBalance - GET (card_details, credintails) :  return success/failure
 *  1. validate pin, card_details
 *  2. based on the cardNumber, fetch the account details and output the balance.
 *
 *  paying back money to the bank (Processor) -> /api post (card_details, credintails, amountGoingToPay) :  return success/failure
 *  1. based on the cardNumber and the amount we received, update the account balance.
 *  2. send notfication based on the response
 *
 *  notification_service
 *
 * */