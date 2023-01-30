package ru.tinkoff.task_santa;

import java.util.*;

public class Chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Map<Integer, Integer> countA = new HashMap<>();
        for (int i : a) {
            countA.put(i, countA.getOrDefault(i, 0) + 1);
        }

        int mostCommonKey = -1;
        int mostCommonValue = -1;
        int secondCommonValue = -1;
        for (Map.Entry<Integer, Integer> entry : countA.entrySet()) {
            if (entry.getValue() > mostCommonValue) {
                secondCommonValue = mostCommonValue;
                mostCommonKey = entry.getKey();
                mostCommonValue = entry.getValue();
            } else if (entry.getValue() > secondCommonValue) {
                secondCommonValue = entry.getValue();
            }
        }

        if (mostCommonValue == 2 && secondCommonValue == 1) {
            int changeIndex = -1;
            int missingNumber = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] == mostCommonKey) {
                    changeIndex = i;
                    break;
                }
            }
            for (int i = 1; i <= n; i++) {
                boolean exists = false;
                for (int j = 0; j < n; j++) {
                    if (a[j] == i) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    missingNumber = i;
                    break;
                }
            }
            int end = a[0];
            for (int i = 0; i < n; i++) {
                end = a[end - 1];
            }
            if (end == a[0]) {
                System.out.println((changeIndex + 1) + " " + missingNumber);
            } else {
                System.out.println((changeIndex + 1) + " " + missingNumber);
            }
        } else {
            System.out.println(-1 + " " + -1);
        }
    }
}

