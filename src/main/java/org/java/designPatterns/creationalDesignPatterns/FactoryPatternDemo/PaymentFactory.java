package org.java.designPatterns.creationalDesignPatterns.FactoryPatternDemo;

public class PaymentFactory {
    public static Payment createPayment(String type) {

        if (type.equalsIgnoreCase("UPI")) {
            return new UpiPayment();
        }
        else if (type.equalsIgnoreCase("CARD")) {
            return new CardPayment();
        }
        else if (type.equalsIgnoreCase("CASH")) {
            return new CashPayment();
        }
        throw new IllegalArgumentException("Invalid payment type");
    }
}
