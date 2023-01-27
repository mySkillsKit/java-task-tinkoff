package org.example;

import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String firstStatus = "21";
        String firstOrgStatus = "117";
        String secondStatus = "1";
        String secondOrgStatus = "101";
        List<Status> statuses = List.of(
                new Status(17L,"171"),
                new Status(120L,""),
                new Status(122L,""),
                new Status(21L,"117"),
                new Status(1L,"101"),
                new Status(7L,"117"),
                new Status(3L,"103"),
                new Status(4L,""),
                new Status(120L,""));

                if(firstStatus.equals(String.valueOf(statuses.get(statuses.size() - 1)))){
                    System.out.println("Hello world!");
                };
        var b = IntStream.range(0, statuses.size() - 1)
                .anyMatch(i -> firstStatus.equals(String.valueOf(statuses.get(i).getStatusId()))
                        && secondStatus.equals(String.valueOf(statuses.get(i + 1).getStatusId())));
        System.out.println(" 21 -> 1 " + b);

        var b2 = IntStream.range(0, statuses.size() - 1)
                .anyMatch(i -> firstStatus.equals(String.valueOf(statuses.get(i).getStatusId()))
                        && secondStatus.equals(String.valueOf(statuses.get(i + 1).getStatusId()))
                        && secondOrgStatus.equals(statuses.get(i + 1).getStateOrgStatusCode()));
        System.out.println(" 21 -> 1  101 " + b2);

            var b3 =     "120".equals(String.valueOf(statuses.get(statuses.size() - 1).getStatusId()));
        System.out.println(" 120 -> нет статусов " + b3);

        var b4 = IntStream.range(0, statuses.size() - 1)
                .anyMatch(i -> firstStatus.equals(String.valueOf(statuses.get(i).getStatusId()))
                        && firstOrgStatus.equals(statuses.get(i).getStateOrgStatusCode())
                        && secondStatus.equals(String.valueOf(statuses.get(i + 1).getStatusId()))
                        && secondOrgStatus.equals(statuses.get(i + 1).getStateOrgStatusCode()));
        System.out.println("21 117 -> 1  101 " + b4);
//
//
//        for (int i = 0; i < statuses.size()-1;i++) {
//           System.out.format("i = %d status = %d / ",i, statuses.get(i));
//           System.out.println();
//           if(firstStatus.equals(String.valueOf(statuses.get(i)))
//           && secondStatus.equals(String.valueOf(statuses.get(i+1)))) {
//               System.out.println();
//               System.out.format("i = %d status = %d / ",i, statuses.get(i));
//               System.out.println();
//               System.out.format("i+1 = %d status = %d / ",i+1, statuses.get(i+1));
//
//           }
//       }


    }
}