# Factory Design Pattern Example: Vehicle Manufacturing

This project demonstrates the Factory design pattern using a vehicle manufacturing scenario.

## Overview

The Factory design pattern provides an interface for creating objects but allows subclasses to alter the type of objects that will be created. It's commonly used to decouple object creation logic from client code.

## Real-Life Example: Vehicle Manufacturing

Consider a vehicle manufacturing plant that produces cars, trucks, and bikes. Each vehicle has its unique manufacturing process, but the overall structure of the manufacturing plant remains the same. Here, we can use the Factory design pattern to create vehicles.

## Implementation

- **Vehicle Interface:** Represents the common behavior of all vehicles.
- **Concrete Vehicle Classes:** Implement the Vehicle interface with specific implementations.
- **VehicleType Enum:** Defines enum constants for different types of vehicles.
- **VehicleFactory Class:** Responsible for creating instances of different types of vehicles based on the provided type.
- **Main Class:** Demonstrates how to use the VehicleFactory to create instances of different types of vehicles.

## How to Run

1. Clone the repository.
2. Compile the Java files.
3. Run the Main class.

## Output
Car is being manufactured <br />
Truck is being manufactured <br />
Bike is being manufactured


## Benefits of Factory Design Pattern

- Promotes loose coupling by abstracting the object creation logic.
- Makes the code easier to maintain and extend by centralizing the object creation code.

## Credits

This example is inspired by real-world scenarios and classic design pattern literature.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

