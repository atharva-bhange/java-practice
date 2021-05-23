package com.company;

public class Main {

    public static void main(String[] args) {
	    Room myRoom = new Room(new Bed(false), new Table(false), new Light(false));

	    myRoom.getTable().study();
	    myRoom.lightOffSleep();
    }
}
