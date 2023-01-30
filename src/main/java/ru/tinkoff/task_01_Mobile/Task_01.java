package ru.tinkoff.task_01_Mobile;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int fareCost = scanner.nextInt(); // стоимость тарифа
        int fareAmount = scanner.nextInt(); // размер тарифа
        int overPriceMb = scanner.nextInt(); // стоимость каждого лишнего мегабайта
        int trafficSize = scanner.nextInt(); // размер интернет рафика в следующем месяце

        int result;

        if (trafficSize > fareAmount) {
            result = (overPriceMb * (trafficSize - fareAmount)) + fareCost;
        } else {
            result = fareCost;
        }

        System.out.println(result);
    }
}
