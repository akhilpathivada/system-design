/**
 * author: akhilpathivada
 * time: 29/05/24 09:16
 */
package strategy.paymentsystem.inefficient;

public class PaymentProcessor {
    private PaymentType paymentType;

    public void processPayment(double amount) {
        if (paymentType == PaymentType.CREDIT_CARD) {
            System.out.println("Processing credit card payment of amount " + amount);
        } else if (paymentType == PaymentType.DEBIT_CARD) {
            System.out.println("Processing debit card payment of amount " + amount);
        } else if (paymentType == PaymentType.PAYPAL) {
            System.out.println("Processing PayPal payment of amount " + amount);
        } else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
