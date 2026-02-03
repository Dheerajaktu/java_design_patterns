package org.java.designPatterns.creationalDesignPatterns.FactoryPatternDemo;

public class CardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paying through card" + amount);
    }
}
