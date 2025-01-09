package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class candice {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> newList = IntStream.range(0, candies.length).mapToObj(i ->
        {
            return candies[i] + extraCandies >= max;
        }).collect(Collectors.toList());
        return newList;
    }
}
