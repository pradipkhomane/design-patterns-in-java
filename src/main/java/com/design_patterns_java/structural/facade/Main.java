package com.design_patterns_java.structural.facade;

// Client code
public class Main {
    public static void main(String[] args) {
        // Client interacts with the MultimediaProcessor facade
        MultimediaProcessor processor = new MultimediaProcessor();

        // Process various multimedia files
        processor.processMultimediaFile("sample.jpg");   // Image file
        processor.processMultimediaFile("sample.mp4");   // Video file
        processor.processMultimediaFile("sample.mp3");   // Audio file
        processor.processMultimediaFile("sample.txt");   // Unsupported file format
    }
}