package com.sparta.fizzbuzz.test;

import com.sparta.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private FizzBuzz theObject;
    @BeforeEach
    void setUp() {
        theObject = new FizzBuzz();
    }

    @Test
    void fizzBuzzTestOne() {
        String result = theObject.fizzBuzz(1);
        String expected = "1";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void fizzBuzzTestTwo() {
        String result = theObject.fizzBuzz(2);
        String expected = "2";
        Assertions.assertEquals(expected, result);
    }
    @Test
    void fizzBuzzTestTwelve() {
        String result = theObject.fizzBuzz(12);
        String expected = "Fizz";
        Assertions.assertEquals(expected, result);
    }
    @Test
    void fizzBuzzTestTen() {
        String result = theObject.fizzBuzz(10);
        String expected = "Buzz";
        Assertions.assertEquals(expected, result);
    }

}