package ru.tinkoff.task_04_listok_number;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // кол-во чисел
        int k = sc.nextInt(); // число операций

        int[] numbers = new int[n]; // числа на листочке

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        PriorityQueue<Integer> operations = new PriorityQueue<>((a, b) -> b - a);

        for (int number : numbers) {
            int length = String.valueOf(number).length() - 1;
            for (int i = 0; i <= length; i++) {
                int operation = ((int) Math.pow(10, i)) * (9 - Integer.parseInt(String.valueOf(number).substring(length - i, length - i + 1)));
                operations.offer(operation);
            }
        }

        long result = 0;

        while (k-- > 0 && !operations.isEmpty()) {
            result += operations.poll();
        }

        System.out.println(result);
    }
}