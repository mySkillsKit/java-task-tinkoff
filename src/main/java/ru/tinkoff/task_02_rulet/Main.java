package ru.tinkoff.task_02_rulet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextLong();
        System.out.println(getResult(n));
    }

    public static int getResult(long n) {
        if (n == 1) {
            return 0;
        }
        int result = n >= Long.highestOneBit(n) ? 1 : 0;
        while (n > 2) {
            n = (long) Math.ceil((double) n / 2);
            result++;
        }
        return result;
    }
}