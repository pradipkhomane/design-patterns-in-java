package com.design_patterns_java.structural.adpater;

// Existing implementation of AudioPlayer
public class DefaultAudioPlayer implements AudioPlayer {

    @Override
    public void playAudio(String fileName) {
        System.out.println("Playing Audio: " + fileName);
    }
}
