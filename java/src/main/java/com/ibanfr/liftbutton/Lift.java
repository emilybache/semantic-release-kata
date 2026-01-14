package com.ibanfr.liftbutton;

public class Lift {
    private String light = "OFF";

    public String doors() {
        return "CLOSED";
    }

    public void pressButton() {
        light = "ON";
    }

    public String light() {
        return light;
    }
}
