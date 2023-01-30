package ru.tinkoff.task5_lyagushka;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        boolean check[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        var flag = false;
        int l = 0;
        int count = 0;
        int max = 0;
        outer:
        while (!flag) {
            if (!check[l]) {
                check[l] = true;
                for (int i = 1; i <= a[n - l - 1]; i++) {
                    int l1 = l + i;
                    if (l1 >= n) {
                        flag = true;
                        break outer;
                    } else {
                        l1 = l1 - b[n - l1 - 1];
                    }
                    max = Math.max(max, l1);
                }
                count++;
                l = max;
                max = 0;
            } else {
                break;
            }
        }
        count = flag ? count + 1 : -1;
        System.out.println(count);
    }
}





