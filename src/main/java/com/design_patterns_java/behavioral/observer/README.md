# Observer Pattern Example: Weather Station

## Overview

The Observer Pattern is a behavioral design pattern where an object (subject) maintains a list of its dependents (
observers) and notifies them of any state changes, usually by calling one of their methods. It promotes loose coupling
between objects, allowing for changes in one object to trigger updates in other dependent objects.

## Real-Life Example: Weather Station

Suppose you have a weather station that measures temperature, humidity, and pressure. Various displays, such as a
current conditions display, a statistics display, and a forecast display, need to be updated whenever weather
measurements change.

## Implementation

- **Weather Data (Subject):** This class represents the subject, which holds the current weather measurements and
  notifies observers of any changes.
- **Observer Interface:** Defines an interface with an update method that concrete observers will implement.
- **Concrete Observers:** Classes representing different displays (e.g., CurrentConditionsDisplay, StatisticsDisplay,
  ForecastDisplay) that implement the Observer interface.
- **Main Application:** Sets up the weather station, attaches displays as observers, and updates weather measurements
  periodically.

## How to Run

1. Clone the repository:
    ```bash
    git clone https://github.com/example/weather-station.git
    ```

2. Compile the Java files:
    ```bash
    javac *.java
    ```

3. Run the application:
    ```bash
    java Main
    ```

## Example Code

```java
// Subject interface
interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

// Observer interface
interface Observer {
    void update(float temperature, float humidity, float pressure);
}

// Concrete subject
class WeatherData implements Subject {
    // Implement subject methods
}

// Concrete observers
class CurrentConditionsDisplay implements Observer {
    // Implement observer methods
}

class StatisticsDisplay implements Observer {
    // Implement observer methods
}

class ForecastDisplay implements Observer {
    // Implement observer methods
}

// Main application
public class Main {
    public static void main(String[] args) {
        // Set up weather station and displays
    }
}
