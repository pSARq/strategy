package org.example1;

/*Otra estrategia concreta*/
public class PaypalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagando con Paypal: " + amount + " pesos");
    }
}
