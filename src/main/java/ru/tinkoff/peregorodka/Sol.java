package ru.tinkoff.peregorodka;

import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double len_x = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double k = X / len_x;
        double fi = Math.atan2(0, X) - Math.atan2(y2 - y1, x2 - x1);

        double y = (Y * (1 - Math.cos(fi)) - k * X * Math.cos(fi))
                / ((1 - k * Math.sin(fi)) * (1 - Math.cos(fi)) + Math.pow(k, 2) * Math.sin(fi) * Math.cos(fi));
        double x = (X + k * y * Math.sin(fi)) / (1 - Math.cos(fi));

        System.out.println(String.format("%.4f", x) + " " + String.format("%.4f", y));
    }
}
