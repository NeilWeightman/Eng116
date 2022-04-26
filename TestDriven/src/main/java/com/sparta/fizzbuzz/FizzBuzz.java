package com.sparta.fizzbuzz;

public class FizzBuzz {
    public String fizzBuzz(int value){
        if(value % 3 == 0)
            return "Fizz";
        else if(value % 5 == 0)
            return "Buzz";
        else
            return Integer.toString(value);
    }
}
