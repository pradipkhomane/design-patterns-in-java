package com.design_patterns_java.behavioral.visitor;

public interface PaymentVisitor {
    void visit(CreditCardPayment creditCardPayment);

    void visit(UpiPayment upiPayment);

    void visit(CryptocurrencyPayment cryptocurrencyPayment);
}
