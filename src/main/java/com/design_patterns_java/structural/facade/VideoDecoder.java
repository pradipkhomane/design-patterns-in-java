package com.design_patterns_java.structural.facade;

// Complex subsystems
public class VideoDecoder {
    public void decodeVideo(String filePath) {
        System.out.println("Decoding video: " + filePath);
    }
}
