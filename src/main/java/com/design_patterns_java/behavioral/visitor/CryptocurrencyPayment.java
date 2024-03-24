package com.design_patterns_java.behavioral.visitor;

public class CryptocurrencyPayment implements PaymentMethod {

    // Implementation of accept method for cryptocurrency payment
    @Override
    public void accept(PaymentVisitor visitor) {
        visitor.visit(this);
    }
}
