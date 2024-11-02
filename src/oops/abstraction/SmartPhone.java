package oops.abstraction;

public abstract class SmartPhone extends MobilePhone{
    @Override
    public void makeCalls() {
        System.out.print("Inherited from mobilephone : ");
        super.makeCalls();
    }

    @Override
    public void receiveCalls() {
        System.out.print("Inherited from mobilephone : ");
        super.receiveCalls();
    }

    @Override
    public void leaveVoiceMails() {
        System.out.print("Inherited from mobilephone :  ");
        super.leaveVoiceMails();
    }

    @Override
    public void sendTextMessages() {
        System.out.println("You can send texts using a smart phone");
    }

    @Override
    public void playGames() {
        System.out.println("You can play games using a smart phone");
    }

    @Override
    public void storeContacts() {
        System.out.println("You can store contacts using a smart phone");
    }

    public abstract void playVideo();
    public abstract void playMusic();
    public abstract void  makeVideoCalls();
}
