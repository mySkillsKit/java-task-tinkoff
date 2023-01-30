package ru.tinkoff.task_05_countDigit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        long count = 0;
        for (long i = l; i <= r; i++) {
            if (i < 10 || i % 11 == 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

