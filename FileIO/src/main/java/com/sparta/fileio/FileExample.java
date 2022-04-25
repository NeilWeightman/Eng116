package com.sparta.fileio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileExample {
    private int variable;
    public static void main(String[] args) {
        // non-static members are only accessible via object references
//        FileExample f = new FileExample();
//        f.variable = 12;
        // static members are available on the class as a whole
//        List<String> theList;
//        theList = readFile("Titanic_R.csv");
//        writeFile(theList);
        try {
            readNIOStyle("Titanic_R.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readNIOStyle(String s) throws IOException {
        // come back to this streams/lambdas/functional programming
        for(String line: Files.lines(Path.of(s)).toList())
            System.out.println(line);
    }

    public static List<String> readFile(String fname){
        List<String> result = null;
        try {
            FileReader fr = new FileReader(fname);
            BufferedReader br = new BufferedReader(fr);
            String line;
            result = new ArrayList<>();
            // discard the heading line
            br.readLine();
            // loop over all remaining lines
            while ((line = br.readLine()) != null){
                result.add(line);
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
        return result;
    }

    public static void writeFile(List<String> theList){
        int[] died = new int[3];
        int[] survived = new int[3];
        for(String row: theList){
            String[] values = row.split(",");
            int pclass = Integer.parseInt(values[0]) - 1;
            int psurvived = Integer.parseInt(values[1]);
            switch(psurvived){
                case 0 -> survived[pclass]++;
                case 1 -> died[pclass]++;
            }
        }
//        System.out.println("Survived 1: " + survived[0]
//                + " 2: " + survived[1]
//                + " 3: " + survived[2]);
//        System.out.println("Died 1: " + died[0]
//                + " 2: " + died[1]
//                + " 3: " + died[2]);
        // try-with-resources
        try (FileWriter fw = new FileWriter("SurvivalStats.txt", true);
        BufferedWriter bw = new BufferedWriter(fw)) {
            bw.append("Survived 1: " + survived[0]
                + " 2: " + survived[1]
                + " 3: " + survived[2] + "\n");
            bw.append("Died 1: " + died[0]
                + " 2: " + died[1]
                + " 3: " + died[2] + "\n");
            // if an exception happens here
            // not executed
        } catch (IOException e) {
            e.printStackTrace();
        }
//        finally {
//            try {
//                bw.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
