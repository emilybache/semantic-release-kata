package com.ibanfr.liftbutton;

public class Lift {
    private boolean lightOn = false;

    public String doors() {
        return "OPEN";
    }

    public void pressButton() {
        lightOn = true;
    }

    public boolean light() {
        return lightOn;
    }
}
