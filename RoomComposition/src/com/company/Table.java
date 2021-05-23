package com.company;

public class Table {
    private boolean isStudying;

    public Table(boolean isStudying) {
        this.isStudying = isStudying;
    }

    public void study(){
        System.out.println("Studying on table");
        this.isStudying = true;
    }

    public boolean isStudying() {
        return isStudying;
    }
}
