package com.ibanfr.liftbutton;

public class Lift {
    private boolean lightOn = false;

    public String doors() {
        return "CLOSED";
    }

    public void pressButton() {
        lightOn = true;
    }

    public String light() {
        if (lightOn) return "ON";
        else return "OFF";
    }
}
