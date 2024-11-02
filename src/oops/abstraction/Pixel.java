package oops.abstraction;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class Pixel extends SmartPhone{
    @Override
    public void makeCalls() {
        super.makeCalls();
    }

    @Override
    public void receiveCalls() {
        super.receiveCalls();
    }

    @Override
    public void leaveVoiceMails() {
        super.leaveVoiceMails();
    }

    @Override
    public void sendTextMessages() {
        System.out.print("Inherited from smartphone : ");
        super.sendTextMessages();
    }

    @Override
    public void playGames() {
        System.out.print("Inherited from smartphone : ");
        super.playGames();
    }

    @Override
    public void storeContacts() {
        System.out.print("Inherited from smartphone : ");
        super.storeContacts();
    }

    @Override
    public void playVideo() {
        System.out.println("You can play videos using google media player");
    }

    @Override
    public void playMusic() {
        System.out.println("You can play music via spotify");
    }

    @Override
    public void makeVideoCalls() {
        System.out.println("You can make video calls using google meet");
    }
}
