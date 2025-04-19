package Polymorphism;
public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        CreditCard creditCard = new CreditCard();
        PayPal payPal = new PayPal();
        Bitcoin bitcoin = new Bitcoin("TX123456789");
        ApplePay applePay = new ApplePay();

        processor.processPayment(creditCard);
        processor.processPayment(payPal);
        processor.processPayment(bitcoin);
        processor.processPayment(applePay);
    }
}