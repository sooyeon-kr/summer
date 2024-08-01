package com.example.summer.isp;

public class BritzSpeaker implements BluetoothSpeaker{

    @Override
    public void connectBluetooth() {
        System.out.println("connected to bluetooth");
    }

    @Override
    public void disconnectBluetooth() {
        System.out.println("disconnected from bluetooth");
    }

    @Override
    public void turnOn() {
        System.out.println("turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("turned off");
    }

    @Override
    public void volumeUp() {
        System.out.println("volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("volume down");
    }
}
