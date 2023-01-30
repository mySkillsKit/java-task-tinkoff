package ru.tinkoff.task_05_countDigit;

import java.util.Scanner;

public class Task_05 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        long l = sc.nextLong(); // первое число
        long r = sc.nextLong(); // последнее число

        int count = 0;
        long value = 0;

        int length = Long.toString(Math.abs(r)).length();

        for (int i = 1; i < 10; i++) {

            for (int j = 1; j <= length; j++) {
                var sb = new StringBuilder(j);
                sb.append(String.valueOf(i).repeat(Math.max(0, j)));
                if (!sb.toString().isEmpty()) {
                    value = Long.parseLong(sb.toString());
                }
                if (value >= l && value <= r) {
                    System.out.print(value + " ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
