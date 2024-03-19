Let's consider a real-life example involving a media player application. Suppose you have an existing media player class called AudioPlayer which can play audio files. Now, you want to extend this application to support playing video files as well. However, the current implementation of the AudioPlayer class is not suitable for playing video files.

To solve this problem, you can use the adapter design pattern to adapt the interface of a new VideoPlayer class to be compatible with the existing AudioPlayer interface.

In this example:

AudioPlayer represents the existing interface for playing audio files.
DefaultAudioPlayer is the implementation of AudioPlayer.
VideoPlayer is the new interface for playing video files.
DefaultVideoPlayer is the implementation of VideoPlayer.
VideoPlayerAdapter adapts the VideoPlayer interface to the AudioPlayer interface by implementing the playAudio method and internally delegating the call to the playVideo method of the VideoPlayer interface.
In the MediaPlayerApp class, we demonstrate playing both audio and video files using the existing AudioPlayer and the adapted VideoPlayer.