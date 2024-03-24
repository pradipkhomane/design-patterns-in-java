package com.design_patterns_java.behavioral.visitor;

public class UpiPayment implements PaymentMethod {

    // Implementation of accept method for UPI payment
    @Override
    public void accept(PaymentVisitor visitor) {
        visitor.visit(this);
    }
}
