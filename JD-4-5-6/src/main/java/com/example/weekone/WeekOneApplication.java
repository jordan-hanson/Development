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
        insertionSortInArrayList(result);
        return result;
    }
    /**
     *
     * Definition: Sort parameter List with Integer 233 added at the 0 index of FibonacciSequence in-place
     * @param fibonnaciList
     */
    public static void insertionSortInArrayList(List<Integer> fibonnaciList){
        // Initialize With 233 at index of 0 to provided array
        fibonnaciList.add(0, 233);
        // Loop through the fibonnaciList and sort starting at index of 1
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
            }
            fibonnaciList.set(previous+1, current);
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
