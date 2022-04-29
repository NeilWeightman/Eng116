package com.sparta.threads;

import java.util.ArrayList;
import java.util.Random;

public class MyThread implements Runnable {
    private ArrayList<String> theList;

    public MyThread(ArrayList<String> theList) {
        this.theList = theList;
    }

    public void method(){
        Random rand = new Random();
        for(int i = 0; i < 500; i++){
            synchronized (theList) {
                theList.add("From my thread "
                        + this.hashCode());
            }
        }
    }

    @Override
    public void run() {
        method();
    }
}
