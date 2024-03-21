package com.design_patterns_java.creational.factory;

// Factory class to create different types of vehicles
public class VehicleFactory {
    public Vehicle createVehicle(VehicleType type) {
        switch (type) {
            case CAR -> {
                return new Car();
            }
            case BIKE -> {
                return new Bike();
            }
            case TRUCK -> {
                return new Truck();
            }
            default -> throw new IllegalArgumentException("Invalid vehicle type " + type);
        }
    }

}
