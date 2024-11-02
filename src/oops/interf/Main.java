package oops.interf;

import oops.interf.devices.Ipad;
import oops.interf.devices.Laptop;
import oops.interf.devices.SmartPhone;
import oops.interf.devices.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        Ipad ipad = new Ipad();
        SmartWatch smartWatch = new SmartWatch();
        Laptop laptop = new Laptop();

        System.out.println("----SmartPhone features----");
        System.out.println("Media features----");
        smartPhone.play();
        smartPhone.pause();
        smartPhone.stop();
        smartPhone.skip();
        System.out.println("Video features---");
        smartPhone.fastForward();
        smartPhone.replay();
        System.out.println("Audio fearures----");
        smartPhone.shuffle();
        smartPhone.createPlaylist();
        System.out.println("Camera features---");
        smartPhone.takePhoto();
        smartPhone.takeVIdeo();
        smartPhone.selfie();
        smartPhone.potrait();
        smartPhone.backCamera();
        System.out.println("Calculator features---");
        smartPhone.add();
        smartPhone.subtract();
        smartPhone.multiply();
        smartPhone.divide();
        System.out.println("Web Browser features---");
        smartPhone.surfInternet();
        smartPhone.playYoutube();
        smartPhone.searchGoogle();
        System.out.println("Mobile phone features---");
        smartPhone.makeCalls();
        smartPhone.sendTexts();

        System.out.println();
        System.out.println("----SmartWatch features----");
        System.out.println("Calculator features----");
        smartWatch.add();
        smartWatch.subtract();
        smartWatch.multiply();
        smartWatch.divide();
        System.out.println("Mobile phone features---");
        smartWatch.makeCalls();
        smartWatch.sendTexts();
        System.out.println("Clock features");
        smartWatch.setTime();
        smartWatch.getAlarm();

        System.out.println();
        System.out.println("----Ipad features----");
        System.out.println("Media features----");
        ipad.play();
        ipad.pause();
        ipad.stop();
        ipad.skip();
        System.out.println("Video features---");
        ipad.fastForward();
        ipad.replay();
        System.out.println("Audio fearures----");
        ipad.shuffle();
        ipad.createPlaylist();
        System.out.println("Camera features---");
        ipad.takePhoto();
        ipad.takeVIdeo();
        ipad.selfie();
        ipad.potrait();
        ipad.backCamera();
        System.out.println("Calculator features---");
        ipad.add();
        ipad.subtract();
        ipad.multiply();
        ipad.divide();
        System.out.println("Web Browser features---");
        ipad.surfInternet();
        ipad.playYoutube();
        ipad.searchGoogle();

        System.out.println();
        System.out.println("---Laptop features----");
        System.out.println("Media features----");
        laptop.play();
        laptop.pause();
        laptop.stop();
        laptop.skip();
        System.out.println("Video features---");
        laptop.fastForward();
        laptop.replay();
        System.out.println("Audio features----");
        laptop.shuffle();
        laptop.createPlaylist();
        System.out.println("Camera features---");
        laptop.takePhoto();
        laptop.takeVIdeo();
        laptop.selfie();
        laptop.potrait();
        System.out.println("Calculator features---");
        laptop.add();
        laptop.subtract();
        laptop.multiply();
        laptop.divide();
        System.out.println("Web Browser features---");
        laptop.surfInternet();
        laptop.playYoutube();
        laptop.searchGoogle();


    }
}
