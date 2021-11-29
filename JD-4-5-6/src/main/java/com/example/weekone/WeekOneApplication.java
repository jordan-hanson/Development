package com.example.weekone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeekOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeekOneApplication.class, args);
        fibonacci(0, 1, 13);
    }

    public static String fibonacci(int firstNumber, int secondNumber, int lengthOfSequence){
        // Example: firstNumber = 0 secondNumber = 1 lengthOfSequence= 13
        String result = "";
        for ( int i = 1; i <= lengthOfSequence; i++){
            if(i == lengthOfSequence){
                result += firstNumber;
                System.out.println(firstNumber);
            } else{
                result += firstNumber + ", ";
                System.out.print(firstNumber + ", ");
            }
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        return result;
    }
}
