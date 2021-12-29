package com.example.sorting;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
    }

    /**
     *
     * Definition: Used to generate a Fibonnaci Sequence starting at 0 and 1, based on the length you provide.
     * @param lengthOfSequence
     * @return ArrayList<Integer>
     */
    public static List<Integer> generateFibonacciSequence(int lengthOfSequence){
        int firstNumber = 0;
        int secondNumber = 1;
        List<Integer> result = new ArrayList<>();
        for ( int i = 0; i <= lengthOfSequence; i++){
            result.add(firstNumber);
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        return result;
    }
    /**
     * Insertion Sort
     * Definition: Sort parameter List with Integer 233 added at the 0 index of FibonacciSequence in-place
     * @param fibonnaciList
     *
     * Notes: This works in-place. It takes total 144 loops to get through the sequence with length of 12
     */
    public static int insertionSort(List<Integer> fibonnaciList){
        int comparableInt = 0;

        // Loop through the fibonnaciList and sort IN PLACE looking at the previous and current
        for (int i = 1; i < fibonnaciList.size(); i++) {
            // Previous index is the current index value - 1
            int previous = i-1;
            // Current index integer value
            Integer current = fibonnaciList.get(i); // key
            // While previous value is greater than the current value
            while ((previous > -1) && (fibonnaciList.get(previous) > current)) {
                // Set the values
                fibonnaciList.set(previous+1, fibonnaciList.get(previous));
                comparableInt = current.compareTo(previous);
                previous--;
            }
            fibonnaciList.set(previous+1, current);
        }
        return comparableInt;
    }

    /**
     * Bubble Sort
     * Definition: Sort parameter List with Integer 233 added at the 0 index of FibonacciSequence
     * @param fibonnaciList
     */
    public static void bubbleSort(List<Integer> fibonnaciList){

        int n = fibonnaciList.size();
        // Loop through the length of the collection list
        for (int i = 0; i < n-1; i++) {
            // For Each element loop through and compare
            for (int j = 0; j < n - i - 1; j++) {
                // If the current value is greater than the next only switch
                if (fibonnaciList.get(j) > fibonnaciList.get(j + 1)) {
                    // Current value to hold as a variable
                    int current = fibonnaciList.get(j);
                    // Next value to hold as a variable
                    int next = fibonnaciList.get(j + 1);
                    // Set the New current and the next values, so the current is now less than the next
                    fibonnaciList.set(j + 1, current);
                    fibonnaciList.set(j, next);
                }
            }
        }
    }

    /**
     * Selection Sort
     * Definition: Sort parameter List with Integer 233 added at the 0 index of FibonacciSequence
     * @param fibonnaciList
     *
     * Notes: Outer Loop count: 12, Inner Loop count: 78, Total count = 90 loops.
     */
    public static void selectionSort(List<Integer> fibonnaciList){

        // Loop through the fibonnaciList and sort starting at index of 0
        int n = fibonnaciList.size();

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
            {
                if (fibonnaciList.get(j) < fibonnaciList.get(min_idx)) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first
            // element
            int temp = fibonnaciList.get(min_idx);
            fibonnaciList.set(min_idx, fibonnaciList.get(i));
            fibonnaciList.set(i, temp);
        }
    }

    /**
     *
     * Definition: Used to reverse an array provided in the parameters.
     * @param arrayToReverse
     * @return List<Integer>
     */
    public static List<Integer> reverseArray(List<Integer> arrayToReverse){
        // duplicate the array
        List<Integer> copiedArrayToReverse = new ArrayList<>(arrayToReverse);

        List<Integer> reversedArray = new ArrayList<>();

        for(int i = copiedArrayToReverse.size() -1; i >= 0; i--){
            reversedArray.add(copiedArrayToReverse.get(i));
        }

        return reversedArray;
    }
}
