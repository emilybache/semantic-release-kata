package com.ibanfr.liftbutton;

public class Lift {
    private boolean lightOn = false;

    public String doors() {
        return "CLOSED";
    }

    public void pressButton() {
        lightOn = true;
    }

    public boolean light() {
        return lightOn;
    }
}
