package ru.tinkoff.task_04_listok_number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Task_04 {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        var n = sc.nextInt(); // кол-во чисел
        var k = sc.nextInt(); // число операций

        int[] numbers = new int[n]; // числа на листочке

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        ArrayList<Integer> operations = new ArrayList();

        for (int number : numbers) {
            int length = String.valueOf(number).length() - 1;
            for (int i = 0; i <= length; i++) {
                String num = String.valueOf(number).substring(length - i, length - i + 1);
                int operation;
                operation = ((int) Math.pow(10, i)) * (9 - Integer.parseInt(num));
                operations.add(operation);
            }
        }
        Collections.sort(operations);
        Collections.reverse(operations);

        long result = 0;

        if (k > operations.size()){
            k = operations.size();
        }

        for (int j = 0; j < k; j++) {
            result = result + operations.get(j);
        }

        System.out.println(result);
    }
}
