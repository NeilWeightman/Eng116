package com.sparta.shop;

import java.util.Comparator;

public interface Printable extends Returnable, Deletable{
    // can't create instance variables
    // can create method signatures, but no method body (for abstract methods)
    void print();

}
