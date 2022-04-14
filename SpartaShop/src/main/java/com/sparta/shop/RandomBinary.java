package com.sparta.shop;

import java.util.Random;

public class RandomBinary {
    public static void main(String[] args) {
        int arraySize = new Random().nextInt(10) + 10;
        int[] theArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = new Random().nextInt(2);
            System.out.println(theArray[i]);
        }
        int longestSequence = 0;
        int currentSequence = 0;
        for(int i =0; i< arraySize; i++){
            if(theArray[i] == 1)
                currentSequence++;
            if(currentSequence > longestSequence)
                longestSequence = currentSequence;
            if(theArray[i] == 0)
                currentSequence = 0;
        }
        System.out.println(longestSequence);
    }
}
