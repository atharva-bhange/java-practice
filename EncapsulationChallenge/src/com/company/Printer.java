package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        if(tonerLevel >100) this.tonerLevel = 100;
        else if(tonerLevel <0) this.tonerLevel =0;
        else this.tonerLevel = tonerLevel;

        this.pagesPrinted = pagesPrinted;

        this.isDuplex = isDuplex;
    }

    public int fillUpToner(int tonerAdded){
        if(tonerAdded < 0 || tonerAdded > 100) return -1;
        int empty = 100 - this.tonerLevel;
        if(tonerAdded > empty) this.tonerLevel = 100;
        else this.tonerLevel += tonerAdded;
        System.out.println("Toner level is now "+this.tonerLevel);
        return 0;
    }

    public int print(int pagesPrinted){

        int pagesToPrint = pagesPrinted;
        if(this.isDuplex) {
            System.out.println("Printing using duplex printer");
            pagesToPrint /= 2;
        }else {
            System.out.println("Printing using normal printer");
        }
        this.pagesPrinted += pagesToPrint;
        System.out.println("Printed total "+this.pagesPrinted+" pages.");
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
