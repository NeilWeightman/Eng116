package com.sparta.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FunctionalIO {
    public static void main(String[] args) throws IOException {
        List<String> surnames = Files
                .lines(Path.of("Titanic_R.csv"))
                .skip(1)
                .map(s -> s.split(",")[3].substring(1))
                .toList();
        System.out.println(surnames);
    }
}
