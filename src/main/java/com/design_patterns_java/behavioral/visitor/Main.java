package com.design_patterns_java.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of payment methods
        List<PaymentMethod> payments = new ArrayList<>();
        payments.add(new CreditCardPayment());
        payments.add(new UpiPayment());
        payments.add(new CryptocurrencyPayment());

        // Create a payment processor
        PaymentVisitor paymentProcessor = new PaymentProcessor();

        // Iterate through the list of payment methods
        for (PaymentMethod payment : payments) {
            // Accept the payment processor visitor
            payment.accept(paymentProcessor);
        }
    }
}
