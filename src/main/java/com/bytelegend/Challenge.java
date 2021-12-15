package com.bytelegend;

public class Challenge {
    public static int total = 0;

    public static void main(String[] args) {
        addAverageOf(1, 3);
        System.out.println("addAverageOf(1,3): " + total);
        addAverageOf(2, 6);
        System.out.println("addAverageOf(2,6): " + total);
        addAverageOf(3, 5);
        System.out.println("addAverageOf(3,5): " + total);
    }

    public static void addAverageOf(int a, int b) {
        int sum = a + b;
        int average = sum / 2;
        total = total + average;
    }
}
