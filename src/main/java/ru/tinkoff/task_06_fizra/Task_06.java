package ru.tinkoff.task_06_fizra;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt(); // Количество учеников
        int[] heightsList = new int[count];
        for (int i = 0; i < count; i++) {
            heightsList[i] = scanner.nextInt(); // создаем список "ростов"
        }

        ArrayList<Integer> evenOnOdd = new ArrayList<>(); // Четное на не четном
        ArrayList<Integer> oddOnEven = new ArrayList<>(); // Нечетное на четном

        for (int i = 0; i < count; i++) {
            if ((heightsList[i] % 2 == 0) && (i + 1) % 2 != 0) {
                evenOnOdd.add(heightsList[i]);
            }
            if ((heightsList[i] % 2 != 0 && (i + 1) % 2 == 0)) {
                oddOnEven.add(heightsList[i]);
            }
        }

        if (evenOnOdd.size() == 1 && oddOnEven.size() == 1) {
            int[] res = new int[2];
            for (int i = 0; i < count; i++) {
                if (heightsList[i] == evenOnOdd.get(0)) res[0] = i + 1;
                if (heightsList[i] == oddOnEven.get(0)) res[1] = i + 1;
            }
            System.out.println(res[0] + " " + res[1]);
        } else if (evenOnOdd.isEmpty() && oddOnEven.isEmpty() && heightsList.length > 2) {
            System.out.println("1 3");
        } else {
            System.out.println("-1 -1");
        }
    }
}
