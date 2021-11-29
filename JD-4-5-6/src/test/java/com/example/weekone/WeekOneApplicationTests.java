package com.example.weekone;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WeekOneApplicationTests {

    @Test
    void fibonacciNumbers() {
        int startingNumber = 0;
        int nextNumber = 1;
        int totalInSequence = 13;
        String expectedOutput = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";

        assertEquals(expectedOutput, WeekOneApplication.fibonacci(startingNumber, nextNumber, totalInSequence));
    }


}