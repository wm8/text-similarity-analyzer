package ru.dz;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class MinHash {
    private static final int NUM_HASHES = 100;

    public static int[] computeMinHash(Set<String> shingles) {
        int[] minHashes = new int[NUM_HASHES];
        Arrays.fill(minHashes, Integer.MAX_VALUE);

        for (String shingle : shingles) {
            for (int i = 0; i < NUM_HASHES; i++) {
                int hash = shingle.hashCode() ^ (i * 31);
                minHashes[i] = Math.min(minHashes[i], hash);
            }
        }

        return minHashes;
    }
}
