package com.design_patterns_java.structural.facade;

// Complex subsystems
public class ImageDecoder {
    public void decodeImage(String filePath) {
        System.out.println("Decoding image: " + filePath);
    }
}
