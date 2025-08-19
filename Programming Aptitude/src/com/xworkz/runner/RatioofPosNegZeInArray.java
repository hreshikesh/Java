package com.xworkz.runner;

import java.util.Scanner;

public class RatioofPosNegZeInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        double positiveRatio;
        double negativeRatio;
        double zeroRatio;

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                positiveCount++;
            } else if (a[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        positiveRatio = (double) positiveCount / n;
        negativeRatio = (double) negativeCount / n;
        zeroRatio = (double) zeroCount / n;

        System.out.printf("%.6f\n", positiveRatio);
        System.out.printf("%.6f\n", negativeRatio);
        System.out.printf("%.6f\n", zeroRatio);
    }
}
