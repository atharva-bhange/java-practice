package com.company;

public class Vehicle {

    private String name;
    private String type;
    private int wheels;
    private double speed;

    public Vehicle(String name, String type, int wheels) {
        this.name = name;
        this.type = type;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getWheels() {
        return wheels;
    }

    public void move(){
        System.out.println("Vehicle moving at speed "+speed);
    }
    public void steer(String direction){
        System.out.println("Vehicle moving in direction "+direction);
    }

    public void changeSpeed(double speed){
        System.out.println("Vehicle speed changed from "+this.speed+" to "+speed);
        this.speed = speed;
    }
}
