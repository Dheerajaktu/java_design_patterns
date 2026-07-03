package org.java.designPatterns.behavioralDesignPatterns;

public class StrategyDesignPatternDemo {

    public static void main(String[] args) {
        PaymentService  paymentService = new PaymentService(new UpiPayment());

        paymentService.makePayment();
    }
}

interface PaymentStrategy {
    void pay();
}

/*
* 1 - UpiPayment
* 2 - CardPayment
* */

class UpiPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Pay upi");
    }
}

class CardPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Pay card");
    }
}

class PaymentService {
    private final PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment() {
        paymentStrategy.pay();
    }
}



