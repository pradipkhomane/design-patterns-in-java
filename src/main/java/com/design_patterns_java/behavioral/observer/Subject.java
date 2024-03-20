package com.design_patterns_java.behavioral.observer;


// Subject interface
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
