package com.company;

public class Room {
    private Bed bed;
    private Table table;
    private Light light;

    public Room(Bed bed, Table table, Light light) {
        this.bed = bed;
        this.table = table;
        this.light = light;
    }

    public void lightOffSleep(){
        this.light.changeLight(false);
        this.bed.sleep();
    }

    public Table getTable() {
        return table;
    }
}
