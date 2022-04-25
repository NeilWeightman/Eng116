package com.sparta.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {
    private int variable;
    public static void main(String[] args) {
        // non-static members are only accessible via object references
//        FileExample f = new FileExample();
//        f.variable = 12;
        // static members are available on the class as a whole
        readFile("Titanic_R.csv");
    }

    public static void readFile(String fname){
        try {
            FileReader fr = new FileReader(fname);
            BufferedReader br = new BufferedReader(fr);
            String line;
            // discard the heading line
            br.readLine();
            // loop over all remaining lines
            while ((line = br.readLine()) != null){
                String[] values = line.split(",");
                System.out.print("[");
                for(String val: values) {
                    System.out.print(val + ", ");
                }
                System.out.println("]");
//                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
