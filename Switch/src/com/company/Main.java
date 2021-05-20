package com.company;

public class Main {

    public static void main(String[] args) {

//        int val = 1;
//
//        if(val == 1){
//            System.out.println("Value is 1");
//        }else if(val == 2){
//            System.out.println("Value is 2");
//        }else{
//            System.out.println("Not 1 or 2");
//        }

        int switchVal = 2;

        switch (switchVal){
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            default:
                System.out.println("Not 1 or 2");
                break;
        }
    }
}
