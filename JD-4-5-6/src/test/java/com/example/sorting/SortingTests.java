package com.example.sorting;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SortingTests {

    @Test
    void generateFibonacciSequence() {
        int totalInSequence = 12;
        ArrayList<Integer> expectedOut = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144));
        assertEquals(expectedOut, Sorting.generateFibonacciSequence(totalInSequence));
    }

    @Test
    void reverseFibonacciSequence(){
        int lengthOfSequence = 12;
        List<Integer> fibonacciSequence = Sorting.generateFibonacciSequence(lengthOfSequence);
        ArrayList<Integer> expectedReverseOutput = new ArrayList<>(Arrays.asList(144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1, 1, 0));
        List<Integer> actualReverseOutput = Sorting.reverseArray(fibonacciSequence);
        assertEquals(expectedReverseOutput, actualReverseOutput);
    }

    @Test
    void insertionSortGreatestValue(){
        List<Integer> unsortedlist = new ArrayList<>(Arrays.asList(233, 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89));
        ArrayList<Integer> expectedSortedList = new ArrayList<Integer>(Arrays.asList(-233,-1,0,1,3,4,4,5,18,24,31,43, 233));
        Integer expectedOut = 1;
        assertEquals(expectedOut, Sorting.insertionSort(unsortedlist));

        // unsortedList and expectedSortedList do NOT equal each other
        assertNotEquals(expectedSortedList, unsortedlist);
        // assert the Negative value (-233) is inserted at index of zero with -1 return
        assertEquals(expectedOut, Sorting.insertionSort(unsortedlist));
        // expect unsortedList to be sorted after insertionSort method in-place
        assertEquals(expectedSortedList, unsortedlist);

    }

    @Test
    void insertionSortInOrder(){
        List<Integer> fibonacciList = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89));
        ArrayList<Integer> expectedSortedList = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89));
        Integer expectedOut = 0;

        // assert the expectedOut is 0 as the fibonacciList was unchanged
        assertEquals(expectedOut, Sorting.insertionSort(fibonacciList));
        // expect fibonacciList to be the same after insertionSort method checked each previous and current value in-place
        assertEquals(expectedSortedList, fibonacciList);
    }

    @Test
    void insertionSortNegativeValue(){
        List<Integer> unsortedList = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, -25, 5, 8, 13, 21, 34, 55, 89));
        ArrayList<Integer> expectedSortedList = new ArrayList<Integer>(Arrays.asList(-25, 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89));

        // unsortedList and expectedSortedList do NOT equal each other
        assertNotEquals(expectedSortedList, unsortedList);
        // assert the Negative value (-25) is inserted at index of zero with -1 return
        Integer expectedOut = -1;
        assertEquals(expectedOut, Sorting.insertionSort(unsortedList));
        // expect unsortedList to be sorted after insertionSort method in-place
        assertEquals(expectedSortedList, unsortedList);
    }

    @Test
    void insertionSortRandomized(){
        List<Integer> randomList = new ArrayList<Integer>(Arrays.asList(233, 0,43,3,1,24,31,18,4,4,5,-1,-233));
        ArrayList<Integer> expectedSortedList = new ArrayList<Integer>(Arrays.asList(-233,-1,0,1,3,4,4,5,18,24,31,43, 233));

        // randomList and expectedSortedList do NOT equal each other
        assertNotEquals(expectedSortedList, randomList);
        // assert the Negative value (-233) is inserted at index of zero with -1 return
        assertEquals(-1, Sorting.insertionSort(randomList));
        // expect randomList to be sorted after insertionSort method in-place
        assertEquals(expectedSortedList, randomList);
    }


}
