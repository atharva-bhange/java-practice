package com.company;

public class Car extends Vehicle {
    private int windows;
    private String colour;
    private int gear;

    public Car(String name, int windows, String colour) {
        super(name, "car", 4);
        this.windows = windows;
        this.colour = colour;
        this.gear = 0;
    }

    public void changeGear(int newGear){
        this.gear = newGear;
    }

    public int getWindows() {
        return windows;
    }

    public String getColour() {
        return colour;
    }

    public int getGear() {
        return gear;
    }
}
