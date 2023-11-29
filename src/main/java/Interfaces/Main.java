package Interfaces;

public class Main {


    public static void main(String[] args) {

        MediaCntroller controller = new MediaCntroller();

        MusicPlayer music = new MusicPlayer();
        controller.playMedia(music);

        VideoPlayer video = new VideoPlayer();
        controller.playMedia(video);


    }
}
