package com.design_patterns_java.creational.factory;

// Concrete implementations of Vehicle interface
public class Car implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Car is being manufactured");
    }
}
