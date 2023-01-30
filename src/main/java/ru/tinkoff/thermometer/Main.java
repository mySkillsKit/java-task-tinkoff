package ru.tinkoff.thermometer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // количество наблюдений
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            sc.next();
            sum += d;
            if (sum < 0) {
                sum = 0;
            }
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}