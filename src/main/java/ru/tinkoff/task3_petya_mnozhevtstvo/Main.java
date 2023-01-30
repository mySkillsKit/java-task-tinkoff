package ru.tinkoff.task3_petya_mnozhevtstvo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var n = sc.nextInt();
        var mas = new Long[n];
        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextLong();
        }
        var mark = false;
        int xMin = (int) Math.sqrt(mas[0]) + 1;
        long k = xMin;
        while (!mark) {
            for (int i = 0; i < n; i++) {
                if (check(k, mas[i])) {
                    k = k * k - mas[i];
                    mark = true;
                } else {
                    ++xMin;
                    k = xMin;
                    mark = false;
                }
            }
        }
        System.out.println(xMin);
    }
    private static boolean check(Long k, Long mas) {
        return (k * k - mas) > 0;
    }
}

/*
ввод 2
ввод 3 4
вывод 3

ввод 5
ввод 1 1 1 1 1
вывод 2


ввод 3
ввод 2 1 100
вывод 3
*
*
*
* */