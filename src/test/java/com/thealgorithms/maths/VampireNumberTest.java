package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class VampireNumberTest {
    @Test
    public void testSplitIntoDigitsWithSingleDigitNumbers() {
        int num = 5;
        int num2 = 9;
        String result = VampireNumber.splitIntoDigits(num, num2);

        assertEquals("59", result);
    }

    @Test
    public void testSplitIntoDigitsWithMultipleDigitNumbers() {
        int num = 123;
        int num2 = 456;
        String result = VampireNumber.splitIntoDigits(num, num2);

        assertEquals("123456", result);
    }

    @Test
    public void testSplitIntoDigitsWithZero() {
        int num = 0;
        int num2 = 0;
        String result = VampireNumber.splitIntoDigits(num, num2);

        assertEquals("", result);
    }

    @Test
    public void testSplitIntoDigitsWithNegativeNumbers() {
        int num = -123;
        int num2 = -456;
        String result = VampireNumber.splitIntoDigits(num, num2);

        assertEquals("", result);
    }

    @Test
    public void test4DigitVampireNumber() {
        int a = 21;
        int b = 60;
        boolean result = VampireNumber.isVampireNumber(a, b, true);

        assertEquals(true, result);
    }

    @Test
    public void test4DigitNonVampireNumber() {
        int a = 21;
        int b = 62;
        boolean result = VampireNumber.isVampireNumber(a, b, true);

        assertEquals(false, result);
    }

    @Test
    public void testCountAndCheck2DigitVampireNumbers() {
        int startValue = 10;
        int stopValue = 99;
        int count = 0;

        ArrayList<String> vampireNumbers = new ArrayList<String>();

        for (int i = startValue; i <= stopValue; i++) {
            for (int j = i; j <= stopValue; j++) {
                if (VampireNumber.isVampireNumber(i, j, true)) {
                    count++;
                    vampireNumbers.add(String.valueOf(i * 100 + j));
                }
            }
        }

        assertEquals(7, count);
        assertEquals(Arrays.asList("1593", "2160", "2187", "2781", "3051", "3541", "8086"), vampireNumbers);
    }

    @Test
    @Disabled
    public void testCountAndCheck3DigitVampireNumbers() {
        int startValue = 100;
        int stopValue = 999;
        int count = 0;

        ArrayList<String> vampireNumbers = new ArrayList<String>();

        for (int i = startValue; i <= stopValue; i++) {
            for (int j = i; j <= stopValue; j++) {
                if (VampireNumber.isVampireNumber(i, j, true)) {
                    vampireNumbers.add(String.valueOf(i * 100 + j));
                    count++;
                }
            }
        }

        System.out.println("Count: " + count);
System.out.println("Vampire Numbers: " + vampireNumbers);

        assertEquals(156, count);

        List<Integer> numbers = Arrays.asList(14301, 14926, 14940, 15538, 15705, 15930, 15961, 16024, 16542, 16501, 16825, 17451, 17401, 18526, 18625, 20610, 20700, 20727, 20997, 20916, 21015, 21501, 21600, 21870, 21906, 21915, 22135, 22464, 22581, 22882, 23301, 23310, 23634, 23643, 23688, 23850, 23859, 24651, 25110, 25681, 25726, 25600, 25708, 25960, 26001, 26307, 26401, 26586, 26685, 27481, 27742, 27810, 28219, 28422, 28543, 28750, 29326, 30451, 30501, 30510, 31522, 31923, 32125, 32161, 32926, 32778, 33075, 32710, 32971, 33106, 33291, 34551, 34492, 34726, 35163, 35401, 35410, 35725, 35487, 35514, 36000, 36009, 36031, 36526, 36936, 37548, 37881, 37570, 39069, 39271, 40063, 40126, 39991, 40014, 42678, 42781, 43807, 43825, 43978, 44091, 44370, 44302, 45508, 46624, 47326, 47331, 47412, 47691, 47542, 48100, 48541, 49090, 49482, 49945, 53023, 53635, 53941, 53986, 53991, 54846, 55399, 55440, 55791, 57253, 57834, 58126, 59130, 59751, 59845, 59962, 63180, 63855, 64750, 65704, 65875, 65983, 66564, 68926, 68859, 72936, 75906, 77463, 78592, 79726, 80860, 81684, 83457, 85176, 86427, 86751, 88402, 90009, 90045, 90306, 90526, 96286);
        Collections.sort(numbers);
        System.out.println(numbers);


        assertEquals(Arrays.asList("1593", "2160", "2187", "2781", "3051", "3541", "8086"), vampireNumbers);
    }

    // tests for 4 digit vampire numbers
    @Test
    public void testVampireNumber1() {
        int a = 2160;
        boolean result = VampireNumber.isVampireNumber(a);

        assertEquals(true, result);

        List<String> vampireNumbers = Arrays.asList("1593", "2160", "2187", "2781", "3051", "3541", "8086");
        // check all the vampire numbers
        for (String vampireNumber : vampireNumbers) {
            int num = Integer.parseInt(vampireNumber);
            assertEquals(true, VampireNumber.isVampireNumber(num), vampireNumber);
        }
    }

    // check 3 digit number
    @Test
    public void testVampireNumber3Digits() {
        assertEquals(false, VampireNumber.isVampireNumber(123));
    }

    // check 15 an 93
    @Test
    public void testVampireNumber4Digits() {
        assertEquals(true, VampireNumber.isVampireNumber(15, 93, true), "15 and 93");
        assertEquals(true, VampireNumber.isVampireNumber(1593), "1593");
    }

    // @Test
    // public void test4DigitVampireNumbers() {
    // int startValue = 1000;
    // int stopValue = 9999;
    // int count = 0;

    // for (int i = startValue; i <= stopValue; i++) {
    // for (int j = i; j <= stopValue; j++) {
    // if (VampireNumber.isVampireNumber(i, j, true)) {
    // count++;
    // }
    // }
    // }

    // assertEquals(4, count);
    // }
    // // and adds the number of vampire numbers to a list
}