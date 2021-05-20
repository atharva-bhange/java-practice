package com.company;

public class Main {

    public static void main(String[] args) {
        //double ans = calculateFeetAndInchesToCentimeter(6,0);
        double ans = calculateFeetAndInchesToCentimeter(12);
        System.out.println("Answer is "+ans);
    }

    public static double calculateFeetAndInchesToCentimeter(double feet, double inches) {
        if(feet < 0 ) return -1;
        if(inches <0 || inches >12) return -1;

        return ((feet * 12) + inches) * 2.54;
    }

    public static double calculateFeetAndInchesToCentimeter(double inches) {
        return calculateFeetAndInchesToCentimeter(inches /12, inches%12);
    }

}

// 1 inch =  2.54 cm
// 1 foot = 12 inch
