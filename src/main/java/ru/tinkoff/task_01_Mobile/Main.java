package ru.tinkoff.task_01_Mobile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int totalCost;
        if (D <= B) {
            totalCost = A;
        } else {
            totalCost = A + (D - B) * C;
        }

        System.out.println(totalCost);
    }
}

