package com.example.weekone;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

class WeekOneApplicationTests {

    @Test
    void generateFibonacciSequence() {
        int totalInSequence = 13;
        ArrayList<Integer> expectedOut = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233));
        assertEquals(expectedOut, WeekOneApplication.generateFibonacciSequence(totalInSequence));
    }


}
