package com.design_patterns_java.structural.adpater;

public class DefaultVideoPlayer implements VideoPlayer {
    @Override
    public void playVideo(String fileName) {
        System.out.println("Playing Video: " + fileName);
    }
}
