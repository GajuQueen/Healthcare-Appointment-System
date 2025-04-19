package Polymorphism;

public class PaymentProcessor{
    public void processPayment(Bitcoin bitcoin){
        System.out.println("Processing Bitcoin Payment:" + bitcoin.getTransactionId());
    }
    public void processPayment(CreditCard creditCard) {
        System.out.println("Processing Credit Card Payment");
    }

    public void processPayment(PayPal payPal) {
        System.out.println("Processing PayPal Payment");
    }
    public void processPayment(ApplePay applePay) {
        System.out.println("Processing Apple Pay Payment");
    }
}

