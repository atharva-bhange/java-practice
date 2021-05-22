package com.company;

public class ModelS extends Car {
    public static String company = "Tesla";

    private boolean isSelfDriving;
    private int charging;

    public boolean isSelfDriving() {
        return isSelfDriving;
    }

    public int getCharging() {
        return charging;
    }

    public ModelS( String colour, boolean isSelfDriving) {
        super("ModelS", 4, colour);
        this.isSelfDriving = isSelfDriving;
        this.charging = 0;
    }

    public void charge(int newCharge){
        System.out.println("Charging increased from "+this.charging+" to "+newCharge);
        this.charging += newCharge;
    }

}
