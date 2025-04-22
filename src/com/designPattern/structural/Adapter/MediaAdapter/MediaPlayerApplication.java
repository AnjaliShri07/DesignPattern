package com.designPattern.structural.Adapter.MediaAdapter;

public class MediaPlayerApplication {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "movie.mp4");
        audioPlayer.play("vlc", "documentary.vlc");
        audioPlayer.play("avi", "mind-boggling-movie.avi"); // Unsupported format
    }
}
//Database Connection Systems

/*
API Integrations: When integrating with third-party services like payment gateways (PayPal, Stripe),
 their API might differ from your application's expected interface. An adapter can be used to standardize
interactions.*/


