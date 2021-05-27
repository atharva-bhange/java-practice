package com.company;

public class BaseBurger {
    private int basePrice;
    private double price;
    private String breadRoll;
    private String meat;
    private String name;
    private boolean isLettuce;
    private boolean isTomato;
    private boolean isCarrot;
    private boolean isOnion;
    static double lettucePrice = 3;
    static double tomatoPrice = 5;
    static double carrotPrice = 9;
    static double onionPrice = 8;


    public BaseBurger(String name,String breadRoll, String meat, int basePrice ) {
        this.price = this.basePrice = basePrice; // Base Price for a burger
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.isLettuce = false;
        this.isTomato = false;
        this.isCarrot = false;
        this.isOnion = false;
        this.name = name;
    }

    public void addLettuce() {
        // Price to add lettuce is 3
        isLettuce = true;
        this.price += BaseBurger.lettucePrice;
    }

    public void addTomato() {
        // Price to add tomato is 5
        isTomato = true;
        this.price += BaseBurger.tomatoPrice;
    }

    public void addCarrot() {
        // Price to add carrot is 9
        isCarrot = true;
        this.price += BaseBurger.carrotPrice;
    }

    public void addOnion() {
        // Price to add onion is 8
        isOnion = true;
        this.price += BaseBurger.onionPrice;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public String getName() {
        return name;
    }

    public boolean isLettuce() {
        return isLettuce;
    }

    public boolean isTomato() {
        return isTomato;
    }

    public boolean isCarrot() {
        return isCarrot;
    }

    public boolean isOnion() {
        return isOnion;
    }

    public int getBasePrice() {
        return basePrice;
    }

    protected void addPrice(double price) {
        this.price += price;
    }

    public void displayInvoice (){
        System.out.println("Burger Name : "+this.name);
        System.out.println("-------------------------------");
        System.out.println("Base Price : $ "+this.basePrice);
        if(this.isCarrot) System.out.println("Carrot : $ "+BaseBurger.carrotPrice);
        if(this.isLettuce) System.out.println("Lettuce : $ "+BaseBurger.lettucePrice);
        if(this.isOnion) System.out.println("Onion : $ "+BaseBurger.onionPrice);
        if(this.isTomato) System.out.println("Tomato : $ "+BaseBurger.tomatoPrice);
    }

    public void displayTotal(){
        System.out.println("Total : $ "+this.price);
    }

    public void displayBill(){
        displayInvoice();
        System.out.println("-------------------------------");
        displayTotal();
    }
}
