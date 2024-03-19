package com.design_patterns_java.structural.adpater;

// Adapter class to adapt VideoPlayer to AudioPlayer
public class VideoPlayerAdapter implements AudioPlayer {
    VideoPlayer videoPlayer;

    public VideoPlayerAdapter(final VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void playAudio(String fileName) {
        // Adapt playAudio to playVideo
        videoPlayer.playVideo(fileName);
    }
}
