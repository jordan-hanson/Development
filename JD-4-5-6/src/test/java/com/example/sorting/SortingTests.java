package com.example.sorting;


import org.junit.jupiter.api.Assertions;
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
        List<Integer> unsortedList = new ArrayList<>(Arrays.asList(233, 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89));
        ArrayList<Integer> expectedSortedList = new ArrayList<Integer>(Arrays.asList(0,1, 1, 2, 3, 5, 8, 13,21,34,55, 89, 233));
        Integer expectedOut = 1;

        // unsortedList and expectedSortedList do NOT equal each other
        assertNotEquals(expectedSortedList, unsortedList);
        // assert the Negative value (-233) is inserted at index of zero with -1 return
        assertEquals(expectedOut, Sorting.insertionSort(unsortedList));
        // expect unsortedList to be sorted after insertionSort method in-place
        assertEquals(expectedSortedList, unsortedList);

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

    @Test
    void quickSortTest() {
        int[] arrayInput = new int[]{233, 0, 43, 3, 1, 24, 31, 18, 4, 4, 5, -1, -233};
        int[] expectedOutput = new int[]{-233, -1, 0, 1, 3, 4, 4, 5, 18, 24, 31, 43, 233};

        // arrayInput does not equal expectedOutput
        Assertions.assertFalse(Arrays.equals(arrayInput, expectedOutput));
        // Ran quickSort Method
        Sorting.quickSort(arrayInput, 0, arrayInput.length -1);
        // ArrayInput now equals expectedOutput
        Assertions.assertTrue(Arrays.equals(arrayInput, expectedOutput));

    }

    @Test
    void bubbleSortTest(){
        List<Integer> inputList = new ArrayList<>(Arrays.asList(233, 0,43,3,1,24,31,18,4,4,5,-1,-233));
        ArrayList<Integer> expectedSortedList = new ArrayList<Integer>(Arrays.asList(-233,-1,0,1,3,4,4,5,18,24,31,43, 233));

        // Input and Expected lists do not match
        assertNotEquals(inputList, expectedSortedList);
        // Ran bubbleSort method
        Sorting.bubbleSort(inputList);
        // InputList now matches the expected SortedList as expected
        assertEquals(inputList, expectedSortedList);
    }

    @Test
    void selectionSortTest(){
        List<Integer> inputList = new ArrayList<>(Arrays.asList(233, 0,43,3,1,24,31,18,4,4,5,-1,-233));
        ArrayList<Integer> expectedSortedList = new ArrayList<Integer>(Arrays.asList(-233,-1,0,1,3,4,4,5,18,24,31,43, 233));

        // Input and Expected lists do not match
        assertNotEquals(inputList, expectedSortedList);
        // Ran bubbleSort method
        Sorting.selectionSort(inputList);
        // InputList now matches the expected SortedList as expected
        assertEquals(inputList, expectedSortedList);
    }

    @Test
    void mergeSortTest() throws Exception {
        int[] arrayInput = new int[]{233, 0, 43, 3, 1, 24, 31, 18, 4, 4, 5, -1, -233};
        int[] expectedOutput = new int[]{-233, -1, 0, 1, 3, 4, 4, 5, 18, 24, 31, 43, 233};

        // arrayInput does not equal expectedOutput
        Assertions.assertFalse(Arrays.equals(arrayInput, expectedOutput));
        // Ran quickSort Method
        Sorting.mergeSort(arrayInput);
        // ArrayInput now equals expectedOutput
        Assertions.assertTrue(Arrays.equals(arrayInput, expectedOutput));

    }

    @Test
    void mergeSortEvenInput() throws Exception {
        int[] arrayEvenInput = new int[]{0, 43, 3, 1, 24, 31, 18, 4, 4, 5, -1, -233}; // even number
        int[] expectedEvenOutput = new int[]{-233, -1, 0, 1, 3, 4, 4, 5, 18, 24, 31, 43};

        // arrayInput does not equal expectedOutput
        Assertions.assertFalse(Arrays.equals(arrayEvenInput, expectedEvenOutput));
        // Ran quickSort Method
        Sorting.mergeSort(arrayEvenInput);
        // ArrayInput now equals expectedOutput
        Assertions.assertTrue(Arrays.equals(arrayEvenInput, expectedEvenOutput));

    }

    @Test
    void mergeSortEmptyInput() throws Exception {
        int[] input = new int[]{}; // empty list
        int[] expectedOutput = new int[]{};

        // Ran quickSort Method
        Sorting.mergeSort(input);
        // ArrayInput now equals expectedOutput
        Assertions.assertTrue(Arrays.equals(input, expectedOutput));

    }

    @Test
    void mergeSortNullInput() throws Exception {
        int[] input = null; // null pointer
        int[] expectedOutput = null;
        String expectedErrorMessage = "Input array cannot be null";

        // Try quickSort Method
        try{
            Sorting.mergeSort(input);
        } catch (Exception e){
            Assertions.assertTrue(e.getMessage().contains(expectedErrorMessage));
        }

    }

    @Test
    void mergeSortAlreadySorted() throws Exception {
        int[] input = new int[]{-233, -1, 0, 1, 3, 4, 4, 5, 18, 24, 31, 43}; // sorted
        int[] expectedOutput = new int[]{-233, -1, 0, 1, 3, 4, 4, 5, 18, 24, 31, 43};

        // Ran quickSort Method
        Sorting.mergeSort(input);
        // ArrayInput now equals expectedOutput
        Assertions.assertTrue(Arrays.equals(input, expectedOutput));

    }

    @Test
    void mergeSortOddLengthNumber() throws Exception {
        int[] input = new int[]{0, 3, 1, 24, 31, 18, 4, 4, 5, -1, -233}; // odd length number
        int[] expectedOutput = new int[]{-233, -1, 0, 1, 3, 4, 4, 5, 18, 24, 31};

        // arrayInput does not equal expectedOutput
        Assertions.assertFalse(Arrays.equals(input, expectedOutput));
        // Ran quickSort Method
        Sorting.mergeSort(input);
        // ArrayInput now equals expectedOutput
        Assertions.assertTrue(Arrays.equals(input, expectedOutput));

    }

    @Test
    void mergeSortOneElement() throws Exception {
        int[] input = new int[]{43}; // one element length
        int[] expectedOutput = new int[]{43};

        // Ran quickSort Method
        Sorting.mergeSort(input);
        // ArrayInput now equals expectedOutput
        Assertions.assertTrue(Arrays.equals(input, expectedOutput));

    }

    @Test
    void mergeSortNegativeElements() throws Exception {
        int[] input = new int[]{-3, -1, -24, -31, -18, -4, -4, -5, -1, -233}; // negative numbers
        int[] expectedOutput = new int[]{-233, -31,-24,-18,-5, -4, -4,-3,-1, -1};

        // arrayInput does not equal expectedOutput
        Assertions.assertFalse(Arrays.equals(input, expectedOutput));
        // Ran quickSort Method
        Sorting.mergeSort(input);
        // ArrayInput now equals expectedOutput
        Assertions.assertTrue(Arrays.equals(input, expectedOutput));

    }

}
