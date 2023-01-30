package ru.tinkoff.taskshifr;

import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var line = sc.nextLine();
        int[] digits = new int[10];
        for (char c : line.toCharArray()) {
            if (c >= '0' && c <= '9') {
                digits[c - '0'] = 1;
            }
        }
        var count = 0;
        for (int i = 0; i < 10; i++) {
            count += digits[i];
        }
        System.out.println(count >= 8 ? "YES" : "NO");
    }
}
