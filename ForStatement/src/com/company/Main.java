package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(calculateInterest(10000,2.0));


        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

    }

    public static double calculateInterest(double amount, double interestRate){
        return amount* (interestRate/100);
    }
}
