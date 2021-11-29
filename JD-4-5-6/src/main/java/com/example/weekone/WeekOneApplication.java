package com.example.weekone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeekOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeekOneApplication.class, args);
        fibonacci(0, 1, 13);
    }

    public static String fibonacci(int firstTerm, int secondTerm, int lengthOfSequence){
        // Example: firstTerm = 0 secondTerm = 1 lengthOfSequence= 13
        String result = "";
        for ( int i = 1; i <= lengthOfSequence; i++){
            if(i == lengthOfSequence){
                result += firstTerm;
                System.out.println(firstTerm);
            } else{
                result += firstTerm + ", ";
                System.out.print(firstTerm + ", ");
            }
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return result;
    }
}
