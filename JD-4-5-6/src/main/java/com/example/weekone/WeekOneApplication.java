package com.example.weekone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class WeekOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeekOneApplication.class, args);
        ArrayList fibonacciArray = fibonacci(0, 1, 13);
        ArrayList reversedFibonacciArray = reverseArray(fibonacciArray);
    }

    public static ArrayList fibonacci(int firstNumber, int secondNumber, int lengthOfSequence){
        // Example: firstNumber = 0 secondNumber = 1 lengthOfSequence= 13
        ArrayList result = new ArrayList();
        for ( int i = 1; i <= lengthOfSequence; i++){
            if(i == lengthOfSequence){
                result.add(firstNumber);
                System.out.println(firstNumber);
            } else{
                result.add(firstNumber);
                System.out.print(firstNumber + ", ");
            }
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        return result;
    }

    public static ArrayList reverseArray(ArrayList arrayToReverse){
        // duplicate the array
        ArrayList<Integer> copiedArrayToReverse = new ArrayList<>(arrayToReverse);

        ArrayList<Integer> reversedArray = new ArrayList<>();

        for(int i = copiedArrayToReverse.size() -1; i >= 0; i--){
            reversedArray.add(copiedArrayToReverse.get(i));
        }

        return reversedArray;
    }
}
