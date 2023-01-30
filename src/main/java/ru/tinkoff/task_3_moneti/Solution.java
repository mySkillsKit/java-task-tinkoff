package ru.tinkoff.task_3_moneti;

import java.util.Scanner;

public class Solution {
    static long countCombinations(long limitSum, int[] coinValue, int index) {
        long combinationsCount = 0;
        if (limitSum < 1) {
            return combinationsCount;
        }
        combinationsCount++;
        for (int i = index; i < coinValue.length; i++) {
            combinationsCount += countCombinations(limitSum - coinValue[index], coinValue, index);
            index++;
        }
        return combinationsCount;
    }

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        long limitSum = sc.nextLong();
        int[] coinValue = new int[3];
        for (int i = 0; i < coinValue.length; i++) {
            coinValue[i] = sc.nextInt();
        }
        System.out.println(countCombinations(limitSum, coinValue, 0));
    }
}

/*
'''Задача L. Три монеты
        У Артемия есть бесконечное число монет, каждая из которых одного из трех номиналов.
        Его интересует, какие суммы от 1 до N рублей он может набрать в свой кошелек,
        если там заранее лежала монета величиной в 1 рубль.
        Формат входных данных
        Первая строка содержит число N — ограничение на суммарную стоимость монет в кошельке (1 ≤ N ≤ 10^18).
        Вторая строка содержит три числа A, B и C, задающие достоинства типов монет (1 ≤ A, B, C ≤ 100000).
        Формат выходных данных
        Выведите единственное число — количество сумм, которые можно набрать в кошельке.
        Замечание
        В первом примере возможны следующие варианты:
        1 = 1
        1 + 4 = 5
        1 + 7 = 8
        1 + 4 + 4 = 9
        1 + 9 = 10
        1 + 4 + 7 = 12
        1 + 4 + 4 + 4 = 13
        1 + 4 + 9 = 14
        1 + 7 + 7 = 15
        Примеры данных
        Пример 1
        Ввод:
        15
        4 7 9
        Вывод: 9

  '''*/
