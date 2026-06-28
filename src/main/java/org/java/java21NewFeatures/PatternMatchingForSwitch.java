package org.java.java21NewFeatures;

public class PatternMatchingForSwitch {

    public static void main(String[] args) {

        Payment payment = new CreditCard("123-456-789");
        processPayment(payment);
    }

    static void processPayment(Payment payment){

        /* Compiler doing internally
        *     if (payment instanceof CreditCard) {
        *       CreditCard c = (CreditCard) payment;
        *     }
        * Means - type check && type cast
        *
        * */

        switch (payment){
            case CreditCard c -> System.out.println("Card Payment : " + c.getCardNumber());

            case UPI upi -> System.out.println("UPI Payment : " + upi.getUpiId());

            case NetBanking netBanking -> System.out.println("Bank : " + netBanking.getBankName());

        }

    }
}


sealed interface Payment permits CreditCard, UPI, NetBanking {}


final class CreditCard implements Payment {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    };
    public String getCardNumber() {
        return cardNumber;
    };

}

final class UPI implements Payment {
    private String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }
    public String getUpiId() {
        return upiId;
    }
}

final class NetBanking implements Payment {
    private String bankName;

    public NetBanking(String bankName) {
        this.bankName = bankName;
    }
    public String getBankName() {
        return bankName;
    }
}