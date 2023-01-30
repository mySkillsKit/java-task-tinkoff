package ru.tinkoff.circuit;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int numberOfFilters = sc.nextInt(); //количество фильтров 5

        //характеристика фильтров a = {1, 2, 5, 7, 4}

        var filterСharacteristics = new int[numberOfFilters];
        for (int i = 0; i < filterСharacteristics.length; i++) {
            filterСharacteristics[i] = sc.nextInt();
        }
//номер фильтра, к которому подключен соответствующий фильтр {1, 1, 2, 2}
        var filterNumber = new int[numberOfFilters];
        for (int i = 1; i < filterNumber.length; i++) {
            filterNumber[i] = sc.nextInt();
        }
        //длина провода соответствующего фильтра {2, 6, 7, 6}
        var lengthCable = new int[numberOfFilters];
        for (int i = 1; i < lengthCable.length; i++) {
            lengthCable[i] = sc.nextInt();
        }

//вывод 1 1 0 0 0 количеству фильтров, которые нагружают фильтр с номером
        var result = new int[numberOfFilters];
        for (int i = 0; i < result.length; i++) {
            int count = 0;
            for (int j = 0; j < filterNumber.length; j++) {
                if (i == filterNumber[j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        System.out.println(Arrays.toString(result));
        for (int i = 0; i < numberOfFilters; i++) {
            System.out.printf("номер фильтра = %d | " +
                    "характеристика фильтров = %d | длина провода = %d |" +
                    "  номер фильтра, к которому подключен соответствующий фильтр = %d ", i + 1, filterСharacteristics[i], lengthCable[i], filterNumber[i]);
            System.out.println();


        }
    }
}

/*
 *
 *
 *
 *
 * */