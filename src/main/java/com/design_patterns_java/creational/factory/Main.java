package com.design_patterns_java.creational.factory;

// Main class to demonstrate the Factory pattern
public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.createVehicle(VehicleType.CAR);
        Vehicle truck = vehicleFactory.createVehicle(VehicleType.TRUCK);
        Vehicle bike = vehicleFactory.createVehicle(VehicleType.BIKE);

        car.manufacture();
        truck.manufacture();
        bike.manufacture();
    }
}
