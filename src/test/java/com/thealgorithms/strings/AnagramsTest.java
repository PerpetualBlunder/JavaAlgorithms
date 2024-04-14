package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AnagramsTest {

    @Test
    public void isAlphabetical() {
        String input1 = "late";
        Anagrams anagrams = new Anagrams();
        assertTrue(anagrams.approach1(input1, "tale"));
        assertTrue(anagrams.approach1(input1, "teal"));
        assertTrue(anagrams.approach2(input1, "tale"));
        assertTrue(anagrams.approach2(input1, "teal"));
        assertTrue(anagrams.approach3(input1, "tale"));
        assertTrue(anagrams.approach3(input1, "teal"));
        assertTrue(anagrams.approach4(input1, "tale"));
        assertTrue(anagrams.approach4(input1, "teal"));
        assertTrue(anagrams.approach5(input1, "tale"));
        assertTrue(anagrams.approach5(input1, "teal"));
    }

    // tests some corner cases
    @Test
    public void testCornerCases() {
        String input1 = "late";
        Anagrams anagrams = new Anagrams();
        assertFalse(anagrams.approach1(input1, "talee"));
        assertFalse(anagrams.approach1(input1, "taal"));
        assertFalse(anagrams.approach1(input1, "tale "));
        assertFalse(anagrams.approach1(input1, "talk"));
        // do all the above checks for the other approaches
        assertFalse(anagrams.approach2(input1, "talee"));
        assertFalse(anagrams.approach2(input1, "taal"));
        assertFalse(anagrams.approach2(input1, "tale "));
        assertFalse(anagrams.approach2(input1, "talk"));
        assertFalse(anagrams.approach3(input1, "talee"));
        assertFalse(anagrams.approach3(input1, "taal"));
        assertFalse(anagrams.approach3(input1, "tale "));
        assertFalse(anagrams.approach3(input1, "talk"));
        assertFalse(anagrams.approach4(input1, "talee"));
        assertFalse(anagrams.approach4(input1, "taal"));
        assertFalse(anagrams.approach4(input1, "tale "));
        assertFalse(anagrams.approach4(input1, "talk"));
    }
    @Test
    public void testCornerCasesApproach5() {
        String input1 = "late";
        Anagrams anagrams = new Anagrams();
        assertFalse(anagrams.approach5(input1, "talee"));
        assertFalse(anagrams.approach5(input1, "taal")); // so approach 5 is wrong!
        assertFalse(anagrams.approach5(input1, "tale "));
        assertFalse(anagrams.approach5(input1, "talk")); // so approach 5 is wrong!
    }        
}
