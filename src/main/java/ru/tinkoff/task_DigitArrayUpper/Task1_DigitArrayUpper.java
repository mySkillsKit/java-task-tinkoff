package ru.tinkoff.task_DigitArrayUpper;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_DigitArrayUpper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n, k, sum = 0;
        n = scanner.nextInt();
        k = scanner.nextInt();

        int[] digits = new int[10];

        for (int i = 0; i < n; i++) {
            digits[scanner.nextInt()]++;
        }
        System.out.println(Arrays.toString(digits));
        int digitNumber = 0;
        for (int i = 0; i < digits.length; i++) {
            if (digitNumber + digits[i] < k) {
                System.out.println("digit: " + i + ", dnum: " + digits[i] + ", mult: " + digits[i] * i);
                sum += digits[i] * i;
                digitNumber += digits[i];
            } else {
                int coefficient = k - digitNumber;
                sum += coefficient * i;
                digitNumber += coefficient;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println(9 * digitNumber - sum); // 5 2 1 2 1 3 5
    }
}
//10 5
//        2 3 8 6 1 2 4 9 5 9
//35
