package StrategyDesignPattern.ConcretePaymentMethods;

import StrategyDesignPattern.PaymentStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card Payment");
    }
}
