package ru.tinkoff.task4_horse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(moveHorse(1, 1, n, m));
    }

    private static int moveHorse(int x, int y, int n, int m) {
        if (x == n && y == m) {
            return 1;
        }
        if (x > n || y > m) {
            return 0;
        }
        return moveHorse(x + 1, y + 2, n, m) + moveHorse(x + 2, y + 1, n, m);
    }
}