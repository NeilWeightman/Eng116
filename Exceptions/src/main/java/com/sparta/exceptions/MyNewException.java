package com.sparta.exceptions;

import java.text.ParseException;

public class MyNewException extends ParseException {
    public MyNewException(String s, int errorOffset) {
        super(s, errorOffset);
    }
}
