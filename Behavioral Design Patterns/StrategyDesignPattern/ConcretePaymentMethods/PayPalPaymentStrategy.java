package StrategyDesignPattern.ConcretePaymentMethods;

import StrategyDesignPattern.PaymentStrategy;

public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing paypal Payment");
    }
}
