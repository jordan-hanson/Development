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
    void fibonacciNumbers() {
        int startingNumber = 0;
        int nextNumber = 1;
        int totalInSequence = 13;
        ArrayList<Integer> expectedOut = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144));
        assertEquals(expectedOut, WeekOneApplication.fibonacci(startingNumber, nextNumber, totalInSequence));
    }


}
