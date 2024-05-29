/**
 * author: akhilpathivada
 * time: 29/05/24 09:18
 */
package strategy.paymentsystem.efficient;

public class PaypalPaymentStrategy implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing paypal payment of amount " + amount);
    }
}
