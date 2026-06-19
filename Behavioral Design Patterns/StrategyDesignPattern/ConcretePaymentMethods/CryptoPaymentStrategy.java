package StrategyDesignPattern.ConcretePaymentMethods;

import StrategyDesignPattern.PaymentStrategy;

public class CryptoPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing crypto Payment");
    }
}
