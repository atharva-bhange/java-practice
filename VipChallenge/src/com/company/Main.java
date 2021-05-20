package com.company;

public class Main {

    public static void main(String[] args) {

        VipCustomer defaultVip = new VipCustomer();
        System.out.println(defaultVip.getName());
        System.out.println(defaultVip.getEmail());
        System.out.println(defaultVip.getCreditLimit());

        VipCustomer Max = new VipCustomer("Max", "max@gmail.com");
        System.out.println(Max.getName());
        System.out.println(Max.getEmail());
        System.out.println(Max.getCreditLimit());

    }
}
