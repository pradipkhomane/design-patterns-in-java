package com.design_patterns_java.creational.builder;

public class User {
    private final String username;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final int age;

    // Constructor is private to enforce the usage of the builder
    private User(String username, String email, String firstName, String lastName, int age) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getters for all attributes
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Static method to get a new instance of UserBuilder
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    // UserBuilder class for constructing User objects
    public static class UserBuilder {
        private String username;
        private String email;
        private String firstName;
        private String lastName;
        private int age;

        // Default constructor for UserBuilder
        public UserBuilder() {

        }

        // Setter methods for each attribute
        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        // Build method to construct a User object
        public User build() {
            return new User(username, email, firstName, lastName, age);
        }
    }
}
