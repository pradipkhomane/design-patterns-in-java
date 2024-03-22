# Facade Design Pattern Example: Multimedia Processing Library

This project demonstrates the Facade design pattern using a multimedia processing library scenario.

## Overview

The Facade design pattern provides a simplified interface to a complex subsystem of classes, making it easier to use. It
hides the complexities of the subsystem and provides a unified interface that clients can interact with.

## Real-Life Example: Multimedia Processing Library

Suppose you're developing a multimedia processing library that can handle various types of multimedia files such as
images, videos, and audio files. Each type of file requires different processing techniques and involves multiple
subsystems for decoding, encoding, and manipulation.

## Implementation

- **Complex Subsystems:**
    - `ImageDecoder`: Decodes image files.
    - `VideoDecoder`: Decodes video files.
    - `AudioDecoder`: Decodes audio files.

- **Facade Class:**
    - `MultimediaProcessor`: Provides a simplified interface for processing multimedia files.

- **Enum for Multimedia File Types:**
    - `FileType`: Enumerates different types of multimedia files (IMAGE, VIDEO, AUDIO, UNKNOWN).

- **Main Class:**
    - Demonstrates how a client interacts with the multimedia processor facade to process various types of multimedia
      files.

## How to Run

1. Clone the repository.
2. Compile the Java files.
3. Run the Main class.

## Output

Decoding image from file: sample.jpg <br />
Decoding video from file: sample.mp4 <br />
Decoding audio from file: sample.mp3 <br />
Unsupported file format

## Benefits of Facade Design Pattern

- Simplifies the usage of complex subsystems by providing a single entry point.
- Clients don't need to know the details of how the subsystem works internally; they interact only with the facade.
- Makes the multimedia processing library easier to use and maintain.

## Credits

This example is inspired by real-world scenarios and classic design pattern literature.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
