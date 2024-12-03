package ru.dz;

import java.util.HashSet;
import java.util.Set;

public class Shingler {
    public static Set<String> generate(String text, int shingleSize) {
        Set<String> shingles = new HashSet<>();
        for (int i = 0; i <= text.length() - shingleSize; i++) {
            shingles.add(text.substring(i, i + shingleSize));
        }
        return shingles;
    }
}
