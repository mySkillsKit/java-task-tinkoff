package ru.tinkoff.task2_kraska;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var n = sc.nextLong();
        var m = sc.nextLong();

        var gcd = greatestCommonDivisor(n, m);
        System.out.println((m / gcd));
    }

    public static long greatestCommonDivisor(long a, long b) {
        if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a % b);
    }
}

// 3 4  - 4
// 5 10   - 2

/*
    Один из других вариантов решения этой задачи может
    включать использование алгоритма Евклида
    для нахождения НОД (наибольшего общего делителя) двух чисел.
    Затем мы можем поделить большее число на НОД, чтобы получить ответ.

    GCD означает "наибольший общий делитель".
     GCD - это наибольшее число, которое делит два числа без остатка.
      Он используется в различных математических приложениях,
       включая алгебру, криптографию и другие области компьютерных наук.
*/

