package org.example1;

/*Clase Context*/
public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /*Aquí se puede agregar un control para cuando se llame este método y
    * todavía no se le haya asignado una estrategia*/
    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
