package ru.tinkoff.task_02_rulet;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = scanner.nextInt(); // количество людей на кофе-брейке.

        int countCuts = (int) (Math.log(countPeople - 1) / Math.log(2)) + 1;

        System.out.println(countCuts);
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int countPeople = scanner.nextInt(); // количество людей на кофе-брейке.
//
//        BigInteger bigInteger = new BigInteger(String.valueOf(countPeople - 1));
//
//        int countCuts = bigInteger.bitLength();
//
//        System.out.println(countCuts);
//    }
}
