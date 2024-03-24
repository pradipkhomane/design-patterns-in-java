package com.design_patterns_java.behavioral.visitor;

public class PaymentProcessor implements PaymentVisitor {
    @Override
    public void visit(CreditCardPayment creditCardPayment) {
        System.out.println("Processing card payment..");
    }

    @Override
    public void visit(UpiPayment upiPayment) {
        System.out.println("Processing upi payment..");
    }

    @Override
    public void visit(CryptocurrencyPayment cryptocurrencyPayment) {
        System.out.println("Processing crypto payment..");
    }
}
