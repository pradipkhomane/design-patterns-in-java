# Visitor Pattern Example: Payment Gateway

This is a simple Java example demonstrating the Visitor Pattern using a payment gateway scenario. The Visitor Pattern
allows adding new operations to an object structure without modifying those structures.

## Overview

In this example, we have a payment gateway system where different payment methods (credit card, UPI, cryptocurrency)
need to be processed differently. We use the Visitor Pattern to achieve this.

## Components

### 1. PaymentMethod Interface

- Defines the interface for all payment methods.
- Includes a method `accept(PaymentVisitor visitor)` for accepting a visitor.

### 2. Concrete Payment Method Classes

- `CreditCardPayment`, `UpiPayment`, and `CryptocurrencyPayment` implement the `PaymentMethod` interface.
- Each class overrides the `accept()` method to call the appropriate method of the visitor.

### 3. PaymentVisitor Interface

- Defines the interface for the payment visitor.
- Includes visit methods for each type of payment method.

### 4. Concrete Visitor Class: PaymentProcessor

- Implements the `PaymentVisitor` interface.
- Provides specific implementations for processing each type of payment method.

### 5. Main Class

- Contains the `main()` method to demonstrate the usage of the Visitor Pattern.
- Creates instances of payment methods and a payment processor.
- Iterates through the list of payment methods, accepting each visitor to process the payment.

## Usage

To run the example:

1. Compile the Java files.
2. Run the `Main` class.

```bash
javac *.java
java Main
