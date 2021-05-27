package com.company;

public class Main {

    public static void main(String[] args) {

        HealthyBurger DietBurger = new HealthyBurger("chicken");
        DietBurger.addLettuce();
        DietBurger.addCarrot();
        DietBurger.addLowFatSauce();

        DietBurger.displayBill();

        DeluxeBurger RichBurger = new DeluxeBurger("Cheese Bread", "chicken");
        RichBurger.addOnion();
        RichBurger.addTomato();

        RichBurger.displayBill();


    }
}
