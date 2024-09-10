package org.example1;

/*Estrategia concreta*/
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagando con tarjeta de crédito: " + amount + " pesos");
    }
}
