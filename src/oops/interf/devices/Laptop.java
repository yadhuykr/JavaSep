package oops.interf.devices;

import oops.interf.features.Calculator;
import oops.interf.features.Camera;
import oops.interf.features.WebBrowser;
import oops.interf.media.AudioPlayer;
import oops.interf.media.VideoPlayer;

public class Laptop extends Camera implements Calculator, WebBrowser, AudioPlayer, VideoPlayer  {
    @Override
    public void add() {
        System.out.println("Can Add two numbers ");
    }

    @Override
    public void subtract() {
        System.out.println("Can Subtract two numbers ");
    }

    @Override
    public void multiply() {
        System.out.println("Can multiply two numbers ");
    }

    @Override
    public void divide() {
        System.out.println("Can divide two numbers ");
    }

    @Override
    public void takePhoto() {
        System.out.println("Can take photos ");
    }

    @Override
    public void takeVIdeo() {
        System.out.println("Can take video");
    }

    @Override
    public void selfie() {
        System.out.println("Can take sefie");
    }

    @Override
    public void potrait() {
        System.out.println("Can take potrait photo");
    }

    @Override
    public void surfInternet() {
        System.out.println("Can surf internet");
    }

    @Override
    public void playYoutube() {
        System.out.println("Can play youtube");
    }

    @Override
    public void searchGoogle() {
        System.out.println("Can do google search");
    }

    @Override
    public void shuffle() {
        System.out.println("Can shuffle playlist");
    }

    @Override
    public void createPlaylist() {
        System.out.println("Can create playlist");
    }

    @Override
    public void fastForward() {
        System.out.println("Can fastforward video");
    }

    @Override
    public void replay() {
        System.out.println("Can replay videos");
    }

    @Override
    public void play() {
        System.out.println("Can play audio and video");
    }

    @Override
    public void pause() {
        System.out.println("Can pause video and audio");
    }

    @Override
    public void stop() {
        System.out.println("Can stop video and audio");
    }

    @Override
    public void skip() {
        System.out.println("Can skip audio and video");
    }
}
