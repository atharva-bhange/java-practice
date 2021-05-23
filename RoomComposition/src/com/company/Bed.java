package com.company;

public class Bed {
    private boolean isSleeping;

    public Bed(boolean isSleeping) {
        this.isSleeping = isSleeping;
    }

    public void sleep(){
        System.out.println("Sleeping in bed");
        this.isSleeping = true;
    }

    public boolean isSleeping() {
        return isSleeping;
    }
}
