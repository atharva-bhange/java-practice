package com.company;

public class Main {

    public static void main(String[] args) {
	    Vehicle BlueOrigin = new Vehicle("Blue Origin", "ship", 0 );
	    Car ModelY = new Car("ModelY",4,"blue");
	    ModelS MyCar = new ModelS("Red", true);

        System.out.println("ModelS is a part of "+ModelS.company);

        MyCar.charge(100);
        MyCar.changeGear(5);
        MyCar.changeSpeed(100);
        MyCar.move();
        MyCar.steer("Left");
    }
}
