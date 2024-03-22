package com.design_patterns_java.structural.facade;

// Facade class
public class MultimediaProcessor {
    private final AudioDecoder audioDecoder;

    private final ImageDecoder imageDecoder;

    private final VideoDecoder videoDecoder;

    public MultimediaProcessor() {
        audioDecoder = new AudioDecoder();
        imageDecoder = new ImageDecoder();
        videoDecoder = new VideoDecoder();
    }


    public void processMultimediaFile(String filePath) {
        FileType fileType = getFileType(filePath);
        switch (fileType) {
            case IMAGE -> {
                imageDecoder.decodeImage(filePath);
                break;
            }
            case AUDIO -> {
                audioDecoder.decodeAudio(filePath);
                break;
            }
            case VIDEO -> {
                videoDecoder.decodeVideo(filePath);
                break;
            }
            default -> System.out.println("Unsupported file format");
        }
    }

    // Method to determine the file type based on file extension
    public FileType getFileType(String filePath) {
        // Extract file extension from file path
        String extension = filePath.substring(filePath.lastIndexOf('.') + 1).toLowerCase();
        // Determine file type based on extension
        return switch (extension) {
            case "jpg", "png" -> FileType.IMAGE;
            case "mp3", "wav" -> FileType.AUDIO;
            case "mp4", "avi" -> FileType.VIDEO;
            default -> FileType.UNKNOWN;
        };
    }
}
