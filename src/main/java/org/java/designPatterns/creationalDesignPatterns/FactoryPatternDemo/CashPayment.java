package org.java.designPatterns.creationalDesignPatterns.FactoryPatternDemo;

public class CashPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paying through cash" + amount);
    }
}
