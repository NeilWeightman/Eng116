package com.sparta.duplicates;

public class DuplicateDriver {
    public static void main(String[] args) {
        DuplicateCounter theCounter = new DuplicateCounter();
        char[] result = theCounter.findDuplicates("Nishant Mandal");
        for(char letter: result){
            System.out.println(letter);
        }
    }
}
