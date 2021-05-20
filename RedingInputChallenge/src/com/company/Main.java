package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while(counter <= 10){
            System.out.println("Enter number #"+counter+": ");
            boolean isNextInt = scanner.hasNextInt();
            if(isNextInt){
                int input = scanner.nextInt();

                sum += input;
                counter ++;
            }else{
                System.out.println("Input value should be an Int!");
            }
            scanner.nextLine();
        }

        System.out.println("Sum is "+sum);
    }
}
