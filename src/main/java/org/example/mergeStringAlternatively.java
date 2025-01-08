package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class mergeStringAlternatively {

    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";

            char[] c1 = word1.toCharArray();
            char[] c2 = word2.toCharArray();
            int maxLength = Math.max(c1.length,c2.length);

        List<Character> charList = IntStream.range(0, maxLength)
                .mapToObj(i -> {
                    List<Character> chars = new ArrayList<>();
                    if (i < c1.length) chars.add(c1[i]);
                    if (i < c2.length) chars.add(c2[i]);
                    return chars;
                })
                .flatMap(List::stream)
                .toList();
        System.out.println();

    }
}
