package com.design_patterns_java.creational.builder;

// Main.java - Example usage
public class Main {
    public static void main(String[] args) {
        User user1 = User.builder()
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .build();

        User user2 = User.builder()
                .firstName("Jane")
                .build();

        System.out.println("User 1: " + user1.getUsername() + ", " + user1.getEmail() + ", " + user1.getFirstName() + ", " + user1.getLastName() + ", " + user1.getAge());
        System.out.println("User 2: " + user2.getUsername() + ", " + user2.getEmail() + ", " + user2.getFirstName() + ", " + user2.getLastName() + ", " + user2.getAge());
    }
}

