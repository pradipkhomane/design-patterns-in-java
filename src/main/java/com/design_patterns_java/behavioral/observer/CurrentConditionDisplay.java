package com.design_patterns_java.behavioral.observer;

// Concrete observer classes
public class CurrentConditionDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Current temperate: "+ temperature + "°C");
    }
}
