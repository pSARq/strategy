package org.example1;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.setPaymentStrategy(new CreditCardPayment());
        paymentProcessor.processPayment(1500);

        paymentProcessor.setPaymentStrategy(new PaypalPayment());
        paymentProcessor.processPayment(5000);
    }
}