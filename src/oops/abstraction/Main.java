package oops.abstraction;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Pixel pixel = new Pixel();
        MobilePhone mobilePhone = new Pixel();

        System.out.println("IPhone features---");
        iphone.makeCalls();
        iphone.receiveCalls();
        iphone.leaveVoiceMails();
        iphone.playGames();
        iphone.storeContacts();
        iphone.sendTextMessages();
        iphone.makeVideoCalls();
        iphone.playMusic();
        iphone.playVideo();

        System.out.println();
        System.out.println("Pixel features---");
        pixel.makeCalls();
        pixel.receiveCalls();
        pixel.leaveVoiceMails();
        pixel.playGames();
        pixel.sendTextMessages();
        pixel.storeContacts();
        pixel.playMusic();
        pixel.playVideo();
        pixel.makeVideoCalls();

        System.out.println("Downcasting example---");
        mobilePhone.makeCalls();
        mobilePhone.receiveCalls();

    }
}
