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
        // Example: lengthOfSequence= 13
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
