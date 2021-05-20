package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int min = -1;
        int max = -1;

        while (true){
            System.out.println("Enter number");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int  value = scanner.nextInt();
                if(counter == 0){
                    min = value;
                    max = value;
                }else{
                    if(value < min) min = value;
                    if(value > max) max = value;
                }
                counter++;
            }else{
                // invalid input
                break;
            }

            scanner.nextLine();
        }

        System.out.println("Thr maximum is "+max);
        System.out.println("The minimum is "+min);
    }
}
