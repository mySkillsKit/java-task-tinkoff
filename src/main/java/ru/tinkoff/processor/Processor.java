package ru.tinkoff.processor;

import java.util.Arrays;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] frequencies = new int[n];
        for (int i = 0; i < n; i++) {
            frequencies[i] = sc.nextInt();
        }
        Arrays.sort(frequencies);
        long maxSumFrequency = 0;
        for (int i = 0; i < frequencies.length; ++i) {
            var sum = sumFrequency(frequencies, i);
            if (maxSumFrequency < sum) {
                maxSumFrequency = sum;
            } else {
                break;
            }
        }
        System.out.println(maxSumFrequency);
    }

    public static long sumFrequency(int[] frequencies, int index) {
        long result = 0;
        int n = frequencies[index];
        for (int i = index; i < frequencies.length; ++i) {
            result += (long) frequencies[i] / n * n;
        }
        return result;
    }
}