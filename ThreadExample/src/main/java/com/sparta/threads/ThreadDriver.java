package com.sparta.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadDriver {
    public static void main(String[] args) {
        ArrayList<String> sharedList = new ArrayList<>();
        MyThread t1 = new MyThread(sharedList);
        MyThread t2 = new MyThread(sharedList);
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
        System.out.println("Everything started");
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All done " + sharedList.size() + " elements");
    }
}
