package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE ;

        System.out.println("Integer Minimum Value = "+myMinIntValue);
        System.out.println("Integer Maximum Value = "+myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue +1));
        System.out.println("Busted Min value = " + (myMinIntValue -1));

        int maxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = "+myMinByteValue);
        System.out.println("Byte Maximum Value = "+myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = "+myMinShortValue);
        System.out.println("Short Maximum Value = "+myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = "+myMinLongValue);
        System.out.println("Long Maximum Value = "+myMaxLongValue);

        byte first = 121;
        short second = 11;
        int third = 12222;

        long total = 50000L + (10L * (first + second + third));
        System.out.println(total);

        short shortTotal = (short) (1000 + 10 * (first + second + third));

    }
}
