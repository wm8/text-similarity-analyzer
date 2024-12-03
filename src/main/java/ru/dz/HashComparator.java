package ru.dz;

public class HashComparator {
    public static double jaccardSimilarity(int[] hash1, int[] hash2) {
        int intersection = 0;

        for (int i = 0; i < hash1.length; i++) {
            if (hash1[i] == hash2[i]) {
                intersection++;
            }
        }

        return (double) intersection / hash1.length;
    }
}
