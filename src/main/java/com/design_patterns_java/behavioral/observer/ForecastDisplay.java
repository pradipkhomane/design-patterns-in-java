package com.design_patterns_java.behavioral.observer;

// Concrete observer classes
public class ForecastDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Weather forecast is same!");
    }
}
