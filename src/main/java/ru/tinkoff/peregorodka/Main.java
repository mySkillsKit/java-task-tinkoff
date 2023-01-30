package ru.tinkoff.peregorodka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        double[] coord = new double[4];
        for (int i = 0; i < 4; i++) {
            coord[i] = sc.nextDouble();
        }

        double lenX = Math.sqrt(Math.pow(coord[2] - coord[0], 2) + Math.pow(coord[3] - coord[1], 2));
        double k = X / lenX;
        double fi = Math.atan2(0, X) - Math.atan2(coord[3] - coord[1], coord[2] - coord[0]);

        double y = (Y * (1 - Math.cos(fi)) - k * X * Math.cos(fi))
                / ((1 - k * Math.sin(fi)) * (1 - Math.cos(fi)) + Math.pow(k, 2) * Math.sin(fi) * Math.cos(fi));

        double x = (X + k * y * Math.sin(fi)) / (1 - Math.cos(fi));

        System.out.printf("%.4f %.4f", x, y);
    }
}

