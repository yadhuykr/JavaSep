package oops.interf.devices;

import oops.interf.features.Calculator;

public class SmartWatch implements Calculator, MobilePhone {
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
        System.out.println("Can divide two numbers");
    }

    @Override
    public void makeCalls() {
        System.out.println("Can make calls");
    }

    @Override
    public void sendTexts() {
        System.out.println("Can send texts");
    }

    public void setTime(){
        System.out.println("Can get time");
    }

    public void getAlarm(){
        System.out.println("Can set Alarm");
    }
}