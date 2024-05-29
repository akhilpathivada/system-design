/**
 * author: akhilpathivada
 * time: 29/05/24 09:20
 */
package strategy.paymentsystem.efficient;

public class PaymentProcessor {

    PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.processPayment(amount);
    }
}
