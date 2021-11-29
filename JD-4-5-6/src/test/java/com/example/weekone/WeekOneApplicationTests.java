package com.example.weekone;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
class WeekOneApplicationTests {

    @Test
    ArrayList fibonacciNumbers() {
        int startingNumber = 0;
        int nextNumber = 1;
        int totalInSequence = 13;
        ArrayList<Integer> expectedOut = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144));
        assertEquals(expectedOut, WeekOneApplication.fibonacci(startingNumber, nextNumber, totalInSequence));

        ArrayList fibonacciOutput = WeekOneApplication.fibonacci(startingNumber, nextNumber, totalInSequence);
        return fibonacciOutput;
    }

    @Test
    void reverseFibonacciNumbers(){
        ArrayList fibonacciSequence = fibonacciNumbers();
        ArrayList<Integer> expectedReverseOutput = new ArrayList<>(Arrays.asList(144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1, 1, 0));
        ArrayList<Integer> actualReverseOutput = WeekOneApplication.reverseArray(fibonacciSequence);
        assertEquals(expectedReverseOutput, actualReverseOutput);
    }


}
