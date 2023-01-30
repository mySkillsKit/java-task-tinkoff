package ru.tinkoff.task_Lift;

import java.util.Scanner;

public class Lift {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var employees = sc.nextInt(); // кол-во сотрудников
        var time = sc.nextInt(); // время через которое уйдет один сотрудник
        int[] floor = new int[employees];
        for (int i = 0; i < floor.length; i++) {
            floor[i] = sc.nextInt();
        }
        var indexOfEmployee = sc.nextInt();
        var leftFloors = floor[indexOfEmployee - 1] - floor[0];
        var rightFloors = floor[employees - 1] - floor[indexOfEmployee - 1];
        var result = floor[employees - 1] - floor[0];
        if (leftFloors < rightFloors) {
            result = leftFloors > time ? result + leftFloors : result;
        } else {
            result = rightFloors > time ? result + rightFloors : result;
        }
        System.out.println(result);
    }
}

