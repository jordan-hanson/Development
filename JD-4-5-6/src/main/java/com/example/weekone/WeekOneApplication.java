package com.example.weekone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeekOneApplication {

    public static void Fibonacci(int firstTerm, int secondTerm, int lengthOfSequence){
        // Example: firstTerm = 0 secondTerm = 1 lengthOfSequence= 13
        for ( int i = 1; i <= lengthOfSequence; i++){
            if(i == lengthOfSequence){
                System.out.println(firstTerm);
            } else{
                System.out.print(firstTerm + ", ");
            }
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }

    public static void main(String[] args) {
        SpringApplication.run(WeekOneApplication.class, args);
        Fibonacci(0, 1, 13);
    }

}
