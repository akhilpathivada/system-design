/**
 * author: akhilpathivada
 * time: 29/05/24 09:18
 */
package strategy.paymentsystem.efficient;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of amount " + amount);
    }
}
