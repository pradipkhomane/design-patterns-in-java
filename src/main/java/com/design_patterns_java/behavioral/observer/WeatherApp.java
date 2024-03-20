package com.design_patterns_java.behavioral.observer;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        // Register observers
        weatherStation.registerObserver(currentConditionDisplay);
        weatherStation.registerObserver(forecastDisplay);

        // Simulate a change in weather
        weatherStation.setTemperature(30.2f);

        // Output:
        // OutputCurrent temperate: 30.2°C
        // Weather forecast is same!
    }
}
