package org.example;

import java.lang.*;

public class GreatestCommonDivisorOfStrings {

    public static void main(String[] args) {
        System.out.println(findCommon());
    }

    private static String findCommon() {
        String str1= "ABCABC", str2="ABC";
        String output = "";
        int check;
        while (true) {
            check = str1.length() + str2.length();
            if (str1.length() > str2.length()) {
                if (str1.indexOf(str2) % 2 != 0) break;
                str1 = str1.replaceFirst(str2, "");
                if (str1.length() == 0) {
                    output = str2;
                    break;
                }
            } else {
                if (str2.indexOf(str1) % 2 != 0) break;
                str2 = str2.replaceFirst(str1, "");
                if (str2.length() == 0) {
                    output = str1;
                    break;
                }
            }
            if (check == str1.length() + str2.length()) break;
        }
        return output;
    }
}