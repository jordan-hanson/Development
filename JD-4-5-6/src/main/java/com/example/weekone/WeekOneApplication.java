package com.example.weekone;

import java.util.ArrayList;
import java.util.List;

public class WeekOneApplication {

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
    public static List<Integer> insertionSort(List<Integer> fibonnaciList){
        // Loop count to count the amount of loops this InsertionSort took
        int outerLoopCount = 0;
        int whileLoopCount = 0;

        // Initialize With 233 at index of 0 to provided array
        fibonnaciList.add(0, 233);
        // Loop through the fibonnaciList and sort IN PLACE looking at the previous and current
        for (int i = 1; i < fibonnaciList.size(); i++) {
            // Previous index is the current index value - 1
            int previous = i-1;
            // Current index integer value
            Integer current = fibonnaciList.get(i); //key
            // While previous value is greater than the current value
            while ((previous > -1) && (fibonnaciList.get(previous) > current)) {
                // Set the values
                fibonnaciList.set(previous+1, fibonnaciList.get(previous));
                previous--;
                whileLoopCount++;
            }
            fibonnaciList.set(previous+1, current);
            outerLoopCount++;
        }

        System.out.println("Outer Loop count: " + outerLoopCount);
        System.out.println("While Loop count: " + whileLoopCount);
        return fibonnaciList;
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

