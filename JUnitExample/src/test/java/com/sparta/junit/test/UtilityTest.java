package com.sparta.junit.test;

import com.sparta.junit.Utility;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Collections;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {

    private Utility theObject;

    @BeforeEach
    void setUp() {
        System.out.println("Setting up the utility object");
        theObject = new Utility();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tidying up");
        theObject = null;
    }

    @ParameterizedTest(name="{index} testing for value {arguments}")
    @CsvFileSource(resources="/testvalues.csv")
    @DisplayName("Test the square() method with a series of values")
    void testSquare(int number, int square) {
        int actual = theObject.square(number);
        System.out.println("In the test method for square()");
        Assertions.assertEquals(square, actual);
    }
    private static Stream<Arguments> getValues() {
        return Stream.of(
                Arguments.arguments(List.)
        );
    }
}