package com.designPattern.structural.Adapter.MediaAdapter;

public interface MediaPlayer {
    void play(String audioType, String fileName);
}

/*Structure:
Client (MediaPlayer): The media player application that can play media files.
        Target Interface (MediaPlayer): Defines the method to play media files.
Adaptee (AdvancedMediaPlayer): Different media players (MP4Player, VLCPlayer) that need to be adapted to fit the
target interface.
Adapter (MediaAdapter): Adapts the incompatible media formats (MP4, VLC) to the standard media player interface.
*/
