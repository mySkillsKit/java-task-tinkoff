package ru.tinkoff.teleskop;

import java.util.Scanner;

public class Teleskop {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] modes = new int[n];
        for (int i = 0; i < n; i++) {
            int mode = sc.nextInt() - 1;
            modes[i] |= (1 << mode);
        }
        int result = 0;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            if ((modes[a] & modes[b]) == 0) {
                result++;
                modes[a] |= modes[b];
                modes[b] |= modes[a];
            }
        }
        System.out.println(result);
    }
}
