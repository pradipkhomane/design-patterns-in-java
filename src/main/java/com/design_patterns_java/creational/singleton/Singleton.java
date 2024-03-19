package com.design_patterns_java.creational.singleton;

public class Singleton {

    // Private static variable to hold the single instance of the class
    private static volatile Singleton _instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {
        // Prevent instantiation via reflection
        if (_instance != null) {
            throw new RuntimeException("Use getInstance() method to create the Singleton instance");
        }
    }

    // Public static method to get the instance of the Singleton class
    public static Singleton getInstance() {
        // Double-checked locking for thread safety
        if (_instance == null) {
            synchronized (Singleton.class) {
                if (_instance == null) {
                    _instance = new Singleton();
                }
            }
        }
        return _instance;
    }

    public static void main(String[] args) {
        Singleton _instance = Singleton.getInstance();
        _instance.doSomething();
    }

    // Example method of the Singleton class
    public void doSomething() {
        System.out.println("Singleton is doing something!");
    }
}
