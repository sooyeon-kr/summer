package com.example.summer.isp;

public interface Speaker {
    /**
     * 기계에 대한 전원이라면, turnOn/Off로 뺄 수도 있음.
     */
    void turnOn();
    void turnOff();

    void volumeUp();
    void volumeDown();


}
