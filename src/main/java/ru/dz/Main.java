package ru.dz;

import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Канонизация текстов
        String canonicalized1 = TextCanonicalizer.canonicalize(Inputs.first);
        String canonicalized2 = TextCanonicalizer.canonicalize(Inputs.second);
        // Подсчет шинглов
        Set<String> shingles1 = Shingler.generate(canonicalized1, 3);
        Set<String> shingles2 = Shingler.generate(canonicalized2, 3);

        System.out.println("Shingles for first input: " + shingles1);
        System.out.println("Shingles for second input: " + shingles2);
        // Подсчет хешей
        int[] hashes1 = MinHash.computeMinHash(shingles1);
        int[] hashes2 = MinHash.computeMinHash(shingles2);

        // Сравнение путем подсчета Коэффициент Жаккара
        double jaccardSimilarity = HashComparator.jaccardSimilarity(hashes1, hashes2);
        System.out.printf("Jaccard: %.2f%%%n", jaccardSimilarity * 100);
    }
}