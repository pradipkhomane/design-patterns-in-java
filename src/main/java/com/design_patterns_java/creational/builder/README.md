# User Builder Pattern Example

This project demonstrates the use of the Builder Pattern to create User objects in Java.

## Overview

In software development, the Builder Pattern is a creational design pattern that provides a flexible solution for
constructing complex objects. It separates the construction of a complex object from its representation, allowing the
same construction process to create different representations.

In this example, we'll use the Builder Pattern to create User objects with various attributes.

## User Class

The `User` class represents a user entity with the following attributes:

- `username`: Username of the user
- `email`: Email address of the user
- `firstName`: First name of the user
- `lastName`: Last name of the user
- `age`: Age of the user

The `User` class has a private constructor and getter methods for each attribute.

## UserBuilder Class

The `UserBuilder` class is a static inner class within the `User` class. It follows the Builder Pattern and is
responsible for constructing `User` objects.

The `UserBuilder` class provides setter methods for each attribute, allowing the client code to set values for each
attribute individually. Each setter method returns the `UserBuilder` object itself, enabling method chaining.

The `build()` method in `UserBuilder` constructs a new `User` object using the values set for each attribute and returns
it.

## Usage

To create a `User` object using the Builder Pattern, follow these steps:

1. Call the static `builder()` method of the `User` class to obtain a new instance of `UserBuilder`.
2. Use the setter methods of `UserBuilder` to set values for the desired attributes.
3. Call the `build()` method of `UserBuilder` to construct the `User` object.

Example:

```java
User user = User.builder()
                .username("john_doe")
                .email("john@example.com")
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .build();
