package com.thealgorithms.maths;

import java.util.ArrayList;
import java.util.List;

public class VampireNumbers {

    // Check if a number is a vampire number
    public static boolean isVampireNumber(int num) {
        String numStr = String.valueOf(num);
        int len = numStr.length();
        
        // We need an even number of digits for a vampire number
        if (len % 2 != 0) {
            return false;
        }
        
        // Iterate through all possible pairs of factors
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                // Get the factors
                int factor1 = i;
                int factor2 = num / i;
                
                // Check if the factors have the correct number of digits
                if (String.valueOf(factor1).length() != len / 2 || String.valueOf(factor2).length() != len / 2) {
                    continue;
                }
                // Check that not both factors end with 0
                if (factor1 % 10 == 0 && factor2 % 10 == 0) {
                    continue;
                }
                
                // Concatenate the factors and check if it's an anagram of the original number
                String concatenated = String.valueOf(factor1) + String.valueOf(factor2);
                if (isAnagram(concatenated, numStr)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Check if two strings are anagrams of each other
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] count = new int[256];
        for (char c : str1.toCharArray()) {
            count[c]++;
        }
        for (char c : str2.toCharArray()) {
            count[c]--;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    // Find all 6-digit vampire numbers
    public static List<Integer> findSixDigitVampireNumbers() {
        List<Integer> vampireNumbers = new ArrayList<>();
        for (int num = 100000; num < 1000000; num++) {
            if (isVampireNumber(num)) {
                vampireNumbers.add(num);
            }
        }
        return vampireNumbers;
    }

    public static void main(String[] args) {
        List<Integer> sixDigitVampireNumbers = findSixDigitVampireNumbers();
        System.out.println("Number of 6-digit vampire numbers: " + sixDigitVampireNumbers.size());
        System.out.println("6-digit vampire numbers: " + sixDigitVampireNumbers);
    }
}
