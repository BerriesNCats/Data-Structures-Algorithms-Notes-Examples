package Algorithms.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class MiniMax {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(256741038);
        integers.add(623958417);
        integers.add(467905213);
        integers.add(714532089);
        integers.add(938071625);
        miniMaxSum(integers);
    }

    public static void miniMaxSum(List<Integer> arr) {
        long sumNot1 = ( (long) arr.get(1) + arr.get(2) + arr.get(3) + arr.get(4));
        long sumNot2 = ( (long) arr.get(0) + arr.get(2) + arr.get(3) + arr.get(4));
        long sumNot3 = ( (long) arr.get(0) + arr.get(1) + arr.get(3) + arr.get(4));
        long sumNot4 = ( (long) arr.get(0) + arr.get(1) + arr.get(2) + arr.get(4));
        long sumNot5 = ( (long) arr.get(0) + arr.get(1) + arr.get(2) + arr.get(3));

        long max = Math.max(Math.max(sumNot1, sumNot2), Math.max(sumNot3, sumNot4));
        max = Math.max(max, sumNot5);

        long min = Math.min(Math.min(sumNot1, sumNot2), Math.min(sumNot3, sumNot4));
        min = Math.min(min, sumNot5);

        System.out.println(min + " " + max);
    }
}
