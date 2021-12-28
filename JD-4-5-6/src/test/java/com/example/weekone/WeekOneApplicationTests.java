package com.example.weekone;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WeekOneApplicationTests {

    @Test
    void generateFibonacciSequence() {
        int totalInSequence = 12;
        ArrayList<Integer> expectedOut = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144));
        assertEquals(expectedOut, WeekOneApplication.generateFibonacciSequence(totalInSequence));
    }

    @Test
    void reverseFibonacciSequence(){
        int lengthOfSequence = 12;
        List<Integer> fibonacciSequence = WeekOneApplication.generateFibonacciSequence(lengthOfSequence);
        ArrayList<Integer> expectedReverseOutput = new ArrayList<>(Arrays.asList(144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1, 1, 0));
        List<Integer> actualReverseOutput = WeekOneApplication.reverseArray(fibonacciSequence);
        assertEquals(expectedReverseOutput, actualReverseOutput);
    }

    @Test
    void insertionSort(){
        int lengthOfSequence = 11;
        List<Integer> fibonacciSequence = WeekOneApplication.generateFibonacciSequence(lengthOfSequence);
        ArrayList<Integer> expectedOut = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 233));
        assertEquals(expectedOut, WeekOneApplication.insertionSort(fibonacciSequence));
    }

    @Test
    void insertionSortRandomized(){
        List<Integer> randomList = new ArrayList<Integer>(Arrays.asList(0,43,3,1,24,31,18,4,4,5,-1,-233));
        ArrayList<Integer> expectedOut = new ArrayList<Integer>(Arrays.asList(-233,-1,0,1,3,4,4,5,18,24,31,43, 233));
        assertEquals(expectedOut, WeekOneApplication.insertionSort(randomList));
    }


}
