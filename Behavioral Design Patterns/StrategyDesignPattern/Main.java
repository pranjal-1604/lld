package StrategyDesignPattern;

import StrategyDesignPattern.ConcretePaymentMethods.CreditCardPaymentStrategy;
import StrategyDesignPattern.ConcretePaymentMethods.CryptoPaymentStrategy;
import StrategyDesignPattern.ConcretePaymentMethods.PayPalPaymentStrategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPaymentStrategy();
        PaymentStrategy payPal = new PayPalPaymentStrategy();

        PaymentProcessor processor = new PaymentProcessor(creditCard);
        processor.processPayment();

        processor.setPaymentStrategy(payPal);
        processor.processPayment();
    }
}
