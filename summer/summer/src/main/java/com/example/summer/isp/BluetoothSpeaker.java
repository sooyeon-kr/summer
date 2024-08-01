package com.example.summer.isp;


/**
 * Marshal : 블루투스 스피커
 * Britz : AI 탑재 X
 * JBL : 블루투스 X, AI X
 */
public interface BluetoothSpeaker {
    void connectBluetooth();
    void disconnectBluetooth();

    void heyGoogle();

    void turnOn();
    void turnOff();

    void volumeUp();
    void volumeDown();


}
