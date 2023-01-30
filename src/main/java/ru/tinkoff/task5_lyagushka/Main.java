package ru.tinkoff.task5_lyagushka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        boolean check[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        boolean flag = false;
        int l = 0;
        int count = 0;
        int max = 0;
        metka:
        while (!flag) {
            if (!check[l]) {
                check[l] = true;
                for (int i = 1; i <= a[n - l - 1]; i++) {
                    int l1 = l + i;
                    if (l1 >= n) {
                        flag = true;
                        break metka;
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
        if (flag) {
            System.out.println(count + 1);
        } else {
            System.out.println(-1);
        }
    }
}
/*
*
3
0 2 2
1 1 0
2
*
*
2
1 1
1 0
-1
*
*
10
0 1 2 3 5 5 6 7 8 5
9 8 7 1 5 4 3 2 0 0
3
* */