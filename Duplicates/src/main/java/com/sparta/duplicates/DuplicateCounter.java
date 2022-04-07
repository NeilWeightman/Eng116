package com.sparta.duplicates;

import java.util.*;

public class DuplicateCounter {
    public char[] findDuplicates(String theSampleString) {
        Map<Character, Integer> charMap = new HashMap<>();
        List<Character> duplicateChars = new ArrayList<>();
        // primitive types: char, byte, short, *int*, long, float, *double*, boolean
        for (char letter : theSampleString.toLowerCase().toCharArray()) {
            if (letter != ' ' && letter != '*') {
                if(charMap.containsKey(letter)){
                    charMap.put(letter, charMap.get(letter) + 1);
                } else {
                    charMap.put(letter, 1);
                }
//                System.out.println(charMap);
            }
        }
        Iterator<Character> iter = charMap.keySet().iterator();
        while(iter.hasNext()){
            char nextLetter = iter.next();
            if(charMap.get(nextLetter) != 1){
                duplicateChars.add(nextLetter);
            }
        }
//        // doesn't work because it is changing the keySet while trying to use it for iteration
//        for(char letter: charMap.keySet()){
//            if(charMap.get(letter) == 1){
//                charMap.remove(letter);
//            }
//        }
//        System.out.println(duplicateChars);
        char[] result = new char[duplicateChars.size()];
        for(int i = 0; i < duplicateChars.size(); i++){
            result[i] = duplicateChars.get(i);
        }
        return result;
    }
}
