package org.java.designPatterns.creationalDesignPatterns.FactoryPatternDemo;

public class UpiPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paying through UPI" + amount);
    }
}
