package com.design_patterns_java.structural.facade;

public class MultimediaApp {
    public static void main(String[] args) {
        MultimediaProcessor multimediaProcessor = new MultimediaProcessor();

        multimediaProcessor.processMultimediaFile("sample.jpg");
        multimediaProcessor.processMultimediaFile("sample.mp3");
        multimediaProcessor.processMultimediaFile("sample.mp4");
        multimediaProcessor.processMultimediaFile("sample.txt");
    }
}
