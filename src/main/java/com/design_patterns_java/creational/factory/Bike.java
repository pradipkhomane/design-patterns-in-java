package com.design_patterns_java.creational.factory;

// Concrete implementations of Vehicle interface
public class Bike implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Bike is being manufactured");
    }
}
