package ru.tinkoff.task_06_fizra;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        ArrayList<Integer> n_odd = new ArrayList<>();
        ArrayList<Integer> n_even = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 > (i + 1) % 2) {
                n_even.add(i + 1);
            }
            if (a[i] % 2 < (i + 1) % 2) {
                n_odd.add(i + 1);
            }
        }

        if (n_odd.size() == 1 && n_even.size() == 1) {
            System.out.println(Math.min(n_odd.get(0), n_even.get(0)) + " " + Math.max(n_odd.get(0), n_even.get(0)));
        } else {
            System.out.println(-1 + " " + -1);
        }
    }
}

