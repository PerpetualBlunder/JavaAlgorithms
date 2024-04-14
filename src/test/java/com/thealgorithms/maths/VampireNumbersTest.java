package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class VampireNumbersTest {

    @Test
    public void testIsVampireNumber() {
        assertTrue(VampireNumbers.isVampireNumber(1260));
        assertTrue(VampireNumbers.isVampireNumber(1395));
        assertFalse(VampireNumbers.isVampireNumber(1234));
        assertFalse(VampireNumbers.isVampireNumber(2468));
    }

    @Test
    public void testIsAnagram() {
        assertTrue(VampireNumbers.isAnagram("123", "321"));
        assertTrue(VampireNumbers.isAnagram("456", "654"));
        assertFalse(VampireNumbers.isAnagram("789", "9876"));
        assertFalse(VampireNumbers.isAnagram("111", "222"));
    }

    @Test
    public void testFind6DigitVampireNumbers() {
        List<Integer> expected = Arrays.asList(102510, 104260, 105210, 105264,
                105750, 108135, 110758, 115672, 116725, 117067, 118440, 120600, 123354, 124483, 125248, 125433, 125460,
                125500, 126027, 126846, 129640, 129775, 131242, 132430, 133245, 134725, 135828, 135837, 136525, 136948,
                140350, 145314, 146137, 146952, 150300, 152608, 152685, 153436, 156240, 156289, 156915, 162976, 163944,
                172822, 173250, 174370, 175329, 180225, 180297, 182250, 182650, 186624, 190260, 192150, 193257, 193945,
                197725, 201852, 205785,
                211896, 213466, 215860, 216733, 217638, 218488, 226498, 226872, 229648, 233896, 241564, 245182, 251896,
                253750, 254740, 260338, 262984, 263074, 284598, 284760, 286416, 296320, 304717, 312475, 312975, 315594,
                315900, 319059, 319536, 326452, 329346, 329656, 336550, 336960, 338296, 341653, 346968,
                361989, 362992, 365638, 368550, 369189, 371893, 378400, 378418, 378450, 384912,
                386415, 392566, 404968, 414895, 416650, 416988, 428980, 429664, 447916, 456840, 457600, 458640,
                475380, 486720, 489159, 489955, 498550, 516879, 529672, 536539, 538650,
                559188, 567648, 568750, 629680, 638950, 673920, 679500,
                729688, 736695, 738468, 769792, 789250, 789525, 792585, 794088,
                809919, 809964, 815958, 829696, 841995, 939658);

        List<Integer> actual = VampireNumbers.findSixDigitVampireNumbers();

        // Write the actual lists to the console
        System.out.println("Actual: " + actual);

        assertEquals(148, actual.size());
        assertTrue(expected.containsAll(actual));
    }

    @Test
    public void testFalseVampireNumbers() {
        List<Integer> falseVampires = Arrays.asList(343680, 353320, 355218, 355719, 356408, 358540, 358560, 378560,
                379236, 380034, 381420, 385875, 393525, 410636, 410976, 447680, 466830, 468559, 477638, 479664, 498960,
                538680, 542736, 543474, 548834, 554040, 570088, 575320, 577368, 579600, 579618, 582570, 592680, 594175,
                615197,
                624184, 625216, 625248, 642570, 648720, 654978, 658560, 662500, 672480, 672750, 672800, 679536, 683200,
                684000,
                684216, 689920, 695520, 713050, 716320, 716350, 718416, 728245, 770932, 777616, 783180, 783882, 785120,
                785862,
                796320, 838540, 852360, 856820, 857500, 859320, 866250, 872546, 875820, 876960, 878688, 879712, 886464,
                887040,
                892320, 901620, 904725, 907200, 907968, 912300, 913236, 916245, 917280, 917568, 919680, 936480, 939920,
                944250, 946176, 948640, 948960, 952056, 961320, 964680, 968992, 974560, 981450, 985824, 986400, 992688,
                994688, 996300, 998896);

        // for each false vampire number check if it is a vampire number
        for (int i : falseVampires) {
            assertFalse(VampireNumbers.isVampireNumber(i), "False vampire number: " + i);
        }
    }

    @Test
    public void testActualVampireNumbers() {

        List<Integer> actualVampires = Arrays.asList(175329, 180225, 180297, 182250, 361989, 369189, 371893, 378400,
                378418,
                384912, 404968, 414895, 447916, 457600, 458640, 475380, 486720, 489159, 489955, 498550, 559188, 567648,
                568750,
                729688, 939658);

        // for each actual vampire number check if it is a vampire number
        for (int i : actualVampires) {
            assertTrue(VampireNumbers.isVampireNumber(i), "Actual vampire number: " + i);
        }
    }
}