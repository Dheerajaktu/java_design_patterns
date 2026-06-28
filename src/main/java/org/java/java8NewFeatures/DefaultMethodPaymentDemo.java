package org.java.java8NewFeatures;

import org.java.javaNewFeatures.java17.Payment;

public class DefaultMethodPaymentDemo {

    public static void main(String[] args) {

        GooglePay googlePay = new GooglePay();
        googlePay.processPayment(1000);
        googlePay.refundPayment(1000);

        PhonePay phonePay = new PhonePay();
        phonePay.processPayment(1000);
        phonePay.refundPayment(1000);

        PaypalPay paypalPay = new PaypalPay();
        paypalPay.processPayment(1000);
        paypalPay.refundPayment(1000);

    }

}



interface payment {
    public void processPayment(double amount);
    /*
    * Later on, requirement comes that each payment company should have refund feature
    * so we will add a default method in payment interface and before java 8 it was not possible to add default method
    * */
    default void refundPayment(double amount){
        System.out.println("Refund Payment Default Feature: " + amount);
    }
}

class GooglePay implements payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Google Pay Payment: " + amount);
    }
}

class PhonePay implements payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Phone Pay Payment: " + amount);
    }
}

class Paytm implements payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paytm Payment: " + amount);
    }
}

class PaypalPay implements payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("PaypalPay Payment: " + amount);
    }
}

