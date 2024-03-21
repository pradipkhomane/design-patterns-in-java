package com.design_patterns_java.structural.facade;

// Complex subsystems
public class AudioDecoder {
    public void decodeAudio(String filePath) {
        System.out.println("Decoding audio: " + filePath);
    }
}
