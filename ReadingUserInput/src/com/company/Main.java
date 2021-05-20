package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int year = scanner.nextInt();

            // handle next line character
            scanner.nextLine();

            System.out.println("Enter Your Name: ");
            String name = scanner.nextLine();

            int age = 2021 - year;

            System.out.println("Your Name is " + name + ", and you are " + age + " year old");

        }
        scanner.close();
    }
}
