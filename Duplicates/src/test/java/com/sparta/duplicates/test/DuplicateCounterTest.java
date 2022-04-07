package com.sparta.duplicates.test;

import com.sparta.duplicates.DuplicateCounter;
import org.junit.jupiter.api.*;

public class DuplicateCounterTest {
    private static DuplicateCounter dup;
    @BeforeAll
    public static void setUp(){
        dup = new DuplicateCounter();
    }
    @Test
    public void testNormalString(){
        char[] result = dup.findDuplicates("Neil Weightman");
        char[] expected = {'e', 'i', 'z'};
        throw new RuntimeException("Eek");
//        Assertions.assertArrayEquals(expected, result);
    }
    @Test
    public void testEmptyString(){
        char[] result = dup.findDuplicates("");
        char[] expected = {};
        Assertions.assertArrayEquals(expected, result);
    }
    @Test
    public void testSomething(){
        Assertions.fail("Not implemented yet");
    }

}
