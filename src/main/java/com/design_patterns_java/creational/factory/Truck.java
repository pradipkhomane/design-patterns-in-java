package com.design_patterns_java.creational.factory;

// Concrete implementations of Vehicle interface
public class Truck implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Truck is being manufactured");
    }
}
