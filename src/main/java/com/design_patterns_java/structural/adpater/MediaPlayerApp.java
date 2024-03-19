package com.design_patterns_java.structural.adpater;

public class MediaPlayerApp {
    public static void main(String[] args) {
        // Using DefaultAudioPlayer to play audio file
        AudioPlayer audioPlayer = new DefaultAudioPlayer();
        audioPlayer.playAudio("Hey you!.mp3");

        VideoPlayer videoPlayer = new DefaultVideoPlayer();
        videoPlayer.playVideo("Hey there!.mp4");

        // Using VideoPlayerAdapter to adapt VideoPlayer to AudioPlayer interface
        AudioPlayer audioPlayerAdaptedForVideo = new VideoPlayerAdapter(videoPlayer);
        audioPlayerAdaptedForVideo.playAudio("Hey Video.mp4");
    }
}
