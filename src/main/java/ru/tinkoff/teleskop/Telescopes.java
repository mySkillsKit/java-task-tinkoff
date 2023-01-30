package ru.tinkoff.teleskop;

import java.util.Scanner;

public class Telescopes {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] modes = new int[n];
        for (int i = 0; i < n; i++) {
            modes[i] = sc.nextInt() - 1;
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            if (modes[a] != modes[b]) {
                count++;
                modes[a] = modes[b] = Math.max(modes[a], modes[b]);
            }
        }
        System.out.println(count);
    }
}
