package com.design_patterns_java.behavioral.visitor;

public interface PaymentMethod {
    void accept(PaymentVisitor visitor);
}
