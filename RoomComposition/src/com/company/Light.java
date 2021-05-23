package com.company;

public class Light {

    private boolean isOn;

    public Light(boolean isOn) {
        System.out.println("Light is now "+(isOn ? "ON" : "OFF"));
        this.isOn = isOn;
    }

    public void changeLight(boolean newState){
        this.isOn = newState;
    }

    public boolean isOn() {
        return isOn;
    }
}
