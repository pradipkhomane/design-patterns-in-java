package com.design_patterns_java.behavioral.visitor;

public class CreditCardPayment implements PaymentMethod {
    // Method for accepting a visitor
    @Override
    public void accept(PaymentVisitor visitor) {
        visitor.visit(this);
    }
}
